# Preview

---
@@ Based on "Foundations of Algorithms" & other resources


## What is an Algorithm?  
>  
> It is a computational problem which specifies an input-output relationship.  
> 어떠한 입력 인수에 대한 해답을 찾아주는 일반적 단계적 절차 = **ALGORITHM**

> keyword : "문제" "해답" "알고리즘"

---

## How do we study Algorithms?  
>  
> Two Types : Problem-based, Design-based
>> **Problem-based** : classifying algorithms according to the type of problem  
>> ***ex. sorting, searching***   
>> **Design-based** : classifying algorithms according to the type of design technique  
>> ***ex. Divide and Conquer, dynamic programming algorithms***  
>  
> 알고리즘은 2가지 type으로 표현이 가능하다.  
> Sturctured English VS. Pseudocode  
> 어떠한 프로그래밍 언어일지라도 알고리즘은 표현이 가능하다.

---

## Fundamentals of Algorithmic Problem Solving
>  
> I. Understand the Problem (문제를 이해한다.)   
>> 새로운 알고리즘을 디자인 하기 전에 우선 주어진 문제의 목적을 정확히 이해해야 한다.  
>> 또한, 입력 데이터에 적용되는 operation의 종류를 정확히 확인해야 한다.  
>> 문제에 부합하는 여러 algorithm이 존재하는 경우 각각의 장단점을 이해하고 **가장 효율적인 부분**을 적용한다.  
>> 만일 이 모두가 존재하지 않는 경우 직접 algorithm을 제작한다.  
>> 입력 되는 값들에 대한 예시 set을 제작하여 **예외 없이 모든 경우**에 부합하는 algorithm을 만들어야 한다.  
>   
> II. Decide On Computational Means / approximate solution / Data Structure / design technique  
> (연산적인 부분의 이해와 결정)  
>> a. **Computational Means**  
>> algorithm을 실행하기 전에 coputational device의 수행능력(capabilities)을 확인한다.  
>>  
>> b. **approximate solution**  
>> exact solution도 있는데 approximate solution을 사용하는 이유?  
>>> 몇몇의 알고리즘은 정확히 연산이 되지 않을 수 있다. ***ex) 제곱근 계산, 비선형 계산***  
>>> exact solution이 오히려 더 느린 연산과정을 초래하는 경우  
>>> 복잡한 algorithm의 일부로 사용되어 문제를 해결하는데 도움이 될 수 있다.  
>>  
>> c. **Design Technique**  
>> 여러 문제를 해결하기 위해 필요한 일반적인 algorithm적 접근 방식이다.  
>>  
>> d. **Data Structure**  
>> 주어진 문제에 따라 해결하기 위한 algorithm이 존재하지 않을 수 있거나 다른 방법들과 복잡하게 결합되는  
>> 경우가 있다. 이런 경우를 위해 때에 따른 적합한 **Data Structure**를 선택해야 한다.  
>     
> III. Design an Algorithm (알고리즘을 디자인한다.)  
>    
> IV. Prove Correctness (정확도를 증명한다.)   
>> 적용한 algorithm이 (주어진) 한도적인 시간 안에 정확한 결과를 산출하는지 증명한다.  
>> 몇몇의 입력 값에 대한 예시로는 알고리즘이 제대로 작동하는지 증명할 수 없다.  
>> 이를 위해 **수학적 귀납법(***mathematical induction***)** 이 일반적으로 사용된다.  
>  
> V. Analyze the algorithm (알고리즘을 분석한다.)  
>> 정확도가 증명되고 난 다음에 고려되는 특성들이다.  
>>* **Efficiency Time**  : 빠른 실행과 적은 메모리 사용
>>* **Simplicity** : 명확하고 이해하기 쉬운 알고리즘  
>>* **Generality**  : 일반적인 문제들에 대한 입력 값들에 대해 정상적인 수행
>>* **Optimality**  : 이보다 더 좋을 수 없는 최적성
>    
> VI. Code the Algorithm (알고리즘을 작성한다.)  
