# Generics

## What is Generics

- Generics는 다양한 타입의 객체를 다루는 메서드나 컬렉션 클래스에 컴파일 시의 타입 체크를 해주는 기능.

  - 타입 안정성을 제공한다.
  - 타입체크와 형변환을 할 수 있으므로 코드가 간결해진다.

  ```java
  public class generics1_inJava {
      class Box<T> {
          T item;
  
          public void setItem(T item) {
              this.item = item;
          }
  
          public T getItem() {
              return item;
          }
      }
  }
  ```

  ```java
  public class generics1_inJava {
      public static void main(String[] args) {
          Box<String> b = new Box<String>();
          b.setItem("ABC");
          String item = b.getItem();
          System.out.println(item);
      }
  }
  출력 : ABC
  ```



- Generics의 제한

  ```java
  Box<Apple> appleBox = new Box<Apple>(); // Apple만 저장가능 
  Box<Grape> grapeBox = new Box<Grape>(); // Grape만 저장가능
  
  Box<Apple>.item과 Box<Apple>.item는 동일해야 한다
  ```



- Generics의 객체 생성

  ```java
  Box<Apple> appleBox = new Box<Apple>
  Box<Fruit> appleBox = new Box<Apple> // 다형성에 의해서 가능.
  
  appleBox.add(new Apple());
  appleBox.add(new Grape()); // 불가
  ```

  ```java
  Box<Fruit> fruitBox = new Box<Fruit>();
  fruitBox.add(new Fruit());
  fruitBox.add(new Apple()); // 가능. Apple이 Fruit의 자손일 때.
  ```



- 제한된 Generics Class

  ```java
  FruitBox<Toy> fruitBox = new FruitBox<Toy>();
  // 과일상자에 장난감을 담을 수 있는 객체
  // 매개변수 T에 타입의 종류를 제한하는 방법이 있을까?
  
  class FruitBox<T extends Fruit> {
      // todo
  }
  ```

  ```java
  FruitBox<Apple> // 가능
  FruitBox<Toy> // 불가능
      
  // Fruit 이외에 다른 타입도 지정해줘야 한다면?
  class FruitBox<T extends Fruit & Vegetable> {
      // todo
  }
  ```



- Generics Method

  - 메서드에 선언부에 Generics 타입이 선언된 메서드를 Generics 메서드라고 함.

    ```java
    예시 : Collections.sort()
    static <T> void sort(List<T> list, Comparator<? super T> c) ...
    ```

  - 형변환

    ```java
    Box box = null;
    Box<Object> objBox = null;
    
    box = (Box)objBox;
    objBox = (Box<Object>) box; // 둘 다 형변환이 가능하나, 경고가 발생한다.
    ```

    ```java
    Box<Object> objBox = null;
    Box<String> strBox = null;
    
    objBox = (Box<Object>) strBox; 
    strbox = (Box<String>) objBox; // 둘 다 에러, 대입된 타입이 Object이어도 불가능.
    ```

    - 형변환 시키는 방법 - 와일드 카드를 이용해라.

      ```java
      Box<? extends Object>
      
      Box<? extends Object wBox> = new Box<String>(); // OK 
      ```