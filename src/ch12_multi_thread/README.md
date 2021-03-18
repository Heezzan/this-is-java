
### 작업 스레드 생성과 실행
- Thread 클래스로부터 직접 생성하는 방법
    - BeepPrintExample1
- Thread 하위 클래스로부터 생성하는 방법
    - BeepPrintExample2, BeepTast
- 스레드 이름
    - `thread.setName("스레드_이름")`, `thread.getName()`
    - ThreadA, ThreadNameExample 
    
### 스레드 우선순위
자바의 스레드 스케줄링엔 우선순위 방식과 순환 할당 방식이 있다.  
우선순위 방식은 `thread.setPriority(1~10)` 메서드를 사용하여 스레드의 우선순위를 결정할 수 있으며, 순환 할당 방식은 JVM에 의해 결정되기 때문에 코드로 제어할 수 없다.  
우선순위 방식에서 1은 가장 우선순위가 낮으며, 10이 우선순위가 가장 높다. 또 우선순위를 부여하지 않을 경우 기본적으로 5의 우선순위를 가진다.

### 동기화 메소드와 동기화 블록

### 스레드 상태
- StatePrintThread, TargetThread, ThreadStateExample 참고