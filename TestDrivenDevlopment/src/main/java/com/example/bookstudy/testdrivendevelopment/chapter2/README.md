# Chapter2 - 타락한 객체


### 일반적인 TDD의 주기

1. 테스트를 작성한다. 머리속에 있는 생각이 어떻게 코드로 나타나길 원하는지 생각해보라.
2. 실행 가능하게 만들어라. 어떤 방법을 써도 좋으니 일단 통과하게 하라.
3. 올바르게 만들어라. 특히 중복을 제거하라

<hr/>
우리 목적은 작동하는 깔끔한 코드를 얻는 것이다.<br/> 
작동하는 깔끔한 코드를 얻는 작업은 도달하기 매우 어려운 목표고, 어쩌면 나 같은 평범한 프로그래머에게는 불가능한 작업일수도 있다.

그렇다면, 나누어서 정복하자(Divede and Conquer)  
일단, **'작동하는 깔끔한 코드'**를 얻어야 한다는 전제에서 **'작동하는'**에 해당하는 부분을 먼저 해결하라. 그러고 나서, **'깔끔한 코드'** 부분을 해결하는 것이다.

<hr/>

화폐 개선 작업
- $5 + 10CHF = $10 (2:1의 환율일 시)
- ~~$5 * 2 = $10~~
- amount를 private로 만들기
- **Dollar 부작용 개선**
- Money 반올림 여부

<hr/>

### 최대한 빨리 GREEN 단계에 돌입하기 위해 사용할 수 있는 전략
1. 가짜로 구현하기 : 상수를 반환하게 만들고 진짜 코드를 얻을 때 까지 단계적으로 상수를 변수로 바꾸어 간다.(명백한 구현 사이에 예상치 못한 에러가 발생했을 때)
2. 명백한 구현 사용하기 : 실제 구현을 입력한다. (내가 뭘 입력해야 할지 알 때)

<hr/>

### 지금 까지 배운 내용 정리

- 설계상의 결함(Dollar 부작용)을 그 결함으로 인해 실패하는 테스트로 변환했다.
- 스텁 구현으로 빠르게 컴파일을 통과하도록 만들었다. (void method() 와 같은 ...)
- 올바르다고 생각하는 코드를 입력하여 테스트를 통과했다.