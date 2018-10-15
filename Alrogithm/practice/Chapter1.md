#알고리즘 : 효율, 분석, 차수

---
@@ Based on "Foundations of Algorithms" & other resources

## Basic concepts  
> Following concepts for design and implement large scale computer programs.  
>> * System Life Cycle  
>> 큰 크기의 컴퓨터 프로그램들은 기본적으로 개발 과정에서 System Life Cycle 을 거친다.  
>>  
>>   a. Requirements Specifications Phase  
>>   세부사항 항목은 프로젝트의 목적과도 같다. 
>>    
>>   b. Analysis Phase  
>>   분석을 통해 해결할 문제를 나누어 다룰수 있을 만한 부분으로 나누어준다.  
>>   ***ex) Bottom-up approach, Top-down approach***  
>>  
>>   c. System Design  
>>   Data objects which are needed by the program  
>>   The operations performed on data objects - require algorithm specification and design strategies  
>>   
>>   d. Refinement and Coding Phase  
>>   데이터 객체에 대한 표현법이 정해지고 이를 위한 알고리즘으 쓰여지게 된다.  
>>  
>>   e. Verification Phase  
>>   프로그램 정확도를 발전시키고 여러 입력값에 대해 프로그램을 테스트한다.  
>>  
>>  
>>  * Algorithm Specification  
>>  큰 규모의 시스템에서 중요한 역할을 하는 효율적인 알고리즘을 설계하는 과정이다.  
>>   
>>  * Data Abstraction  
>>  Collection Objects and a set of operations  
>>> Abstract Data Type  
>>> 
 
>>  * Data Structure  
>>  **Data Structure = Abstract (logical) + Physical (Storage) Structure**  
>>  Abstract Structure = deals with **mathematical aspect** of data   
>>  ***ex) test for zero, addition, test for equality, successor***  
>>  Storage Structure = deals with representation **data in computer storage**  


##단위연산 (basic instruction)

##시간 복잡도 (time complexity analysis)

T(n) - 일정 시간복잡도 (every-case time complexity)

W(n) - 최악 시간복잡도 (worst-case time complexity)

A(n) - 평균 시간복잡도 (average-case time complexity)

B(n) - 최선 시간복잡도 (best-case time complexity analysis)

메모리(공간) 복잡도 (memory complexity), 복잡도 함수 (complexity function)

차수(n)에 따른 시간복잡도

궁극적으로 1차시간 알고리즘이 2차 시간 알고리즘보다 빠르다.

순수2차함수는 세타로 표현 -> 2차시간 알고리즘

이를 비교하는 것이 복잡도 카테고리 (complexity category)

big O - notation

big Omega-notation
small o notation
