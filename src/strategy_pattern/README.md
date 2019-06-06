## Strategy pattern

- 전략 패턴(strategy pattern) 또는 정책 패턴(policy pattern)은 실행 중에 알고리즘을 선택할 수 있게 하는 행위 디자인 패턴이다.
- 프로그램을 확장 했을 때 변경될 알고리즘이 있다면 이 알고리즘을 클래스별로 캡슐화하고 필요할 때 교체할 수 있도록 한다.

## 예시 (Strategy Pattern 적용 전)

- 군인을 만들어서 이름을 갖게하고 공격/이동 기능을 넣는다.
- 군인은 여러 좋유의 군인이 있기에 Abstract 클레스(Millitary.java)로 정의한 후 여러 군인을 만들때 이를 상속 받아서 구현한다.
- 우선 육군과 공군을 만들었다.
  - 육군 - 공격:지상  이동:걸어서이동    
  - 공군 - 공격:하늘  이동:비행기로이동    

- Class Diagram

![Ex_Strategy01](https://user-images.githubusercontent.com/31425312/59021442-c4c8cd00-8886-11e9-811b-e2395937ac67.PNG)
