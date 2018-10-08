분할정복 (Divied-and-Conquer)

1. 이분검색
분할-정복-취합
이를 재귀적으로 분할하여 지속적으로 실행함
꼬리 재귀 (tail-recursion)

2. 합병정렬 (two-way merging)
배열을 계속 반씩 나누어가면서 순서대로 배열하는 정렬방법

제자리정렬(in-place sort)

4. 빠른정렬(분할교환정렬)

빠른정렬(QuickSort)
기준원소(pivot)를 설정하여 기준원소 보다 작으면 왼쪽, 크면 오른쪽으로 보내준다.
입력값으로 양의 정수 n, 배열 S

일정복잡도 계산이 불가능하다. 따라서 최악의 경우, 평균의 경우만 구한다.

- 최악의 경우: 완전히 정렬된 배열을 정렬하는 경우
T(n) = T(0) + T(n-1) + n-1, n>0, T(0) = 0

T(n) = n*(n-1)/2