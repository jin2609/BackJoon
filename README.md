# BACKJOON_ALGORITHM
## Introduction
### Goal
Backjoon Algorithm solve the problem and share my solution.  
### Additional information
I used **Java** to solve the problem. And I am not good at English.  
if you want to know how to solve problem, should watch my code. I put up notes by korean.  
You can enter the problem and solution just click.  

------------------------------------------------------------------
## Solved Problem
### 2019.06.20  
#### [backjoon_11718(Print)](https://www.acmicpc.net/problem/11718)   
- [Solution](backjoon_11718/src/backjoon_11718/Main.java) : Use java util Scanner  
- I could learn about Scanner skill.  
#### [backjoon_11060(Jump Jump)](https://www.acmicpc.net/problem/11060)  
- [Solution](backjoon_11060/src/backjoon_11060/Main.java) : I think it greedy  
- This problems were easy, but worth considering.  
---------------------------------------------------------------------
### 2019.06.23  
#### [backjoon_15686(Chicken Delivery)](https://www.acmicpc.net/problem/15686)  
- [Solution](backjoon_15686/src/backjoon_15686/Main.java) : Use combination by backtracking  
- I realized that I am weak at the number of occasions.. lololo...
---------------------------------------------------------------------
### 2019.08.26   
#### [kakao_15953(Prize Money Hunter)](https://www.acmicpc.net/problem/15953)  
- [Solution](kakao_15953/src/kakao_15953/Main.java) : Use equal order & an even order sequence  
- I can solve it with simple thoughts and songs.  
-----------------------------------------------------------------------
### 2020.01.06
#### [kakao_15954(Dolls)](https://www.acmicpc.net/problem/15984)  
- [Solution](kakao_15954/src/kakao_15954/Main.java) : Use nested for statements  
- This problem was very interesting. I realized I had to read the problem well, and once again I could think about scope.  
------------------------------------------------------------------------
### 2020.1.17  
#### [kakao_15955(Booster)](https://www.acmicpc.net/problem/15955)★★★★★  
- [Solution](kakao_15955/src/kakao_15955/Main.java) : Use disjoint-set  
- I have used several methods to solve this problem.  
First, I used dynamic programming and greedy method. But I can see timeout, and memory exceeded error. So, I think diffrents way that is dijkstra.
Second, I used dijkstra algorithm. But the result was the same.  
- This problem is quite difficult. I solved this problem using disjoint-set.  
The disadvantage of disjoint-set is that it is difficult to separate groups. If life comes in ascending order, nothing happens to separate. So I made a class with an x coordinate, a y coordinate, and a problem number. Then, to receive the question, I made a class that has start point, finish point, life, and problem number. The questions were arranged in ascending order of life. And whenever the value of life changed, it Added a set.  
I defined a class called Pair to align the points with the x- and y-coordinates to form a pair and put them in an array. The class has the number and distance of points. If made that way, there will be a total of 2N-2 pairs. The pairs were arranged in ascending order. If so, there are many benefits of time-complexity because it is not necessary to look at pairs that are not required when life changes.
------------------------------------------------------------------------
### 2020.1.24  
#### [backjoon_1018(Re-painting the chessboard)](https://www.acmicpc.net/problem/1018)  
- [Solution](backjoon_1018/src/backjoon_1018/Main.java) : Use for-statements  
- This problem was difficult to understand. But I understand that it was easy to solve. I used iterative sentences to calculate a rectangle divided into eight squares. The color of the upper left column was divided into black and white.
------------------------------------------------------------------------
### 2020.1.25  
#### [backjoon_step1(print_Arithmetic)](https://www.acmicpc.net/step/1)
- [Code](backjoon_step1/src/)  
- I thought I should build up the foundation. So I solve the problem step by step.  
- This step is about the output statement and Arithmetic. The problem was so easy that I didn't write down an explanation.
#### [backjoon_step2(if)](https://www.acmicpc.net/step/4)
- [Code](backjoon_step2/src/)  
- This step is about conditional statements.  
#### [backjoon_step3(for)](https://www.acmicpc.net/step/3)
- [Code](backjoon_step3/src/)
- This step is about for-statement.
#### [backjoon_step4(while)](https://www.acmicpc.net/step/2)
- [Code](backjoon_step4/src/)
- This step is about while-statement.
#### [backjoon_step5(array)](https://www.acmicpc.net/step/6)
- [Code](backjoon_step5/src/)
- This step is about array.
------------------------------------------------------------------------
### 2020.1.27  
#### [backjoon_step6(function)](https://www.acmicpc.net/step/5)
- [Code](backjoon_step6/src/)  
- This step is about function.  
- Question 1065 was quite interesting.  
- I used DP to solve problem 4673.

#### [backjoon_step7(String)](https://www.acmicpc.net/step/7)
- [Code](backjoon_step7/src/)  
- This step is about string.  
- As I solved the problem this time, there is a new String function. It is 'indexOf'.

```java
String test = "ABCDE";

System.out.println(test.indexOf("A")); //0
System.out.println(test.indexOf("B")); //1
System.out.println(test.indexOf("BC")); //1
System.out.println(test.indexOf("C")); //2
System.out.println(test.indexOf("F")); //-1
```  
if a string contains a character that is received as a parameter, return the start index of that character. If not, return -1.

------------------------------------------------------------------------
### 2020.1.28
#### [backjoon_1712(break-even point)](https://www.acmicpc.net/problem/1712)  
- [Solution](backjoon_step8/src/backjoon_1712/Main.java)  
- This is a question of finding break even point.

#### [backjoon_2839(Sugar delivery)](https://www.acmicpc.net/problem/2839)  
- [Solution](backjoon_step8/src/backjoon_2839/Main.java)  
- It is a matter of carrying sugar in a minimum bag. Sugar is given in 3kg and 5kg bags.
I asked for a case where I used as much 5kg sugar as I could.  

#### [backjoon_2292(Honeycomb)](https://www.acmicpc.net/problem/2292)  
- [Solution](backjoon_step8/src/backjoon_2292/Main.java)  
- It is a matter of how many spaces from the center are to be found. The sequence of the steps was calculated and solved by calculating the sequence with a difference of six degrees.

------------------------------------------------------------------------
### 2020.1.29
#### [backjoon_1193(find_fountain)](https://www.acmicpc.net/problem/1193)  
- [Solution](backjoon_step8/src/backjoon_1193/Main.java)  
- This is a question of finding fountain. I found the rules and solved them.

#### [backjoon_2869(climb_snail)](https://www.acmicpc.net/problem/2869)  
- [Solution](backjoon_step8/src/backjoon_2869/Main.java)  
- This problem is calculating when snails rise. Snails rise during the day and go down at night. When snail go to the top, you don't go down. I realized that I had to check the size of input in this matter.

------------------------------------------------------------------------
### 2020.1.30
#### [backjoon_10250(ACM Hotel)](https://www.acmicpc.net/problem/10250)  
- [Solution](backjoon_step8/src/backjoon_10250/Main.java)  
- This question said to me, you should think about exception!! I just think.. it is so easy problem. I can solve it divided! But There was a trap.

#### [backjoon_2775(number of residents)](https://www.acmicpc.net/problem/2775)  
- [Solution](backjoon_step8/src/backjoon_2775/Main.java)  
- I can solve this problem using recursion. The number of residents I want to find, is sum of the lower floor of the same room and previous room on the same floor. And first room's number of residents is 1 always.  

------------------------------------------------------------------------
### 2020.1.31
#### [backjoon_1011(Fly me to the Alpha Centauri)](https://www.acmicpc.net/problem/1011)  
- [Solution](backjoon_step8/src/backjoon_1011/Main.java)  
- This question is very hard to think.. I can get idea to solve problem by 1+2+3+...+n = (n*n-1)/2.

#### [backjoon_1978(finding minority)](https://www.acmicpc.net/problem/1978)  
- [Solution](backjoon_step9/src/backjoon_1978/Main.java)  
- This question is finding minority. I can solve this problem using % operator.

#### [backjoon_2581(minority)](https://www.acmicpc.net/problem/2581)  
- [Solution](backjoon_step9/src/backjoon_2581/Main.java)  
- This problem is to find a fraction of a given section and to obtain the sum and minimum value.

#### [backjoon_1929(minority)](https://www.acmicpc.net/problem/1929)  
- [Solution](backjoon_step9/src/backjoon_1929/Main.java)  
- This problem is to find a fraction of a given section and to obtain prime number.

------------------------------------------------------------------------
### 2020.2.5
#### [backjoon_4948(Bertrand's postulate)](https://www.acmicpc.net/problem/4948)  
- [Solution](backjoon_step9/src/backjoon_4948/Main.java)  
- This problem is to find a number of minority.

------------------------------------------------------------------------
### 2020.2.7
#### [backjoon_9020(Goldbach's conjecture)](https://www.acmicpc.net/problem/9020)  
- [Solution](backjoon_step9/src/backjoon_9020/Main.java)  

#### [backjoon_1085(Rectangular escape)](https://www.acmicpc.net/problem/1085)  
- [Solution](backjoon_step9/src/backjoon_1085/Main.java)  

#### [backjoon_3009(Fourth point)](https://www.acmicpc.net/problem/3009)  
- [Solution](backjoon_step9/src/backjoon_3009/Main.java)  

#### [backjoon_4153(Right triangle)](https://www.acmicpc.net/problem/4153)  
- [Solution](backjoon_step9/src/backjoon_4153/Main.java)  

#### [backjoon_3053(Taxicab Geometry)](https://www.acmicpc.net/problem/3053)  
- [Solution](backjoon_step9/src/backjoon_3053/Main.java)  

#### [backjoon_10872(factorial)](https://www.acmicpc.net/problem/10872)  
- [Solution](backjoon_step10/src/backjoon_10872/Main.java)  

#### [backjoon_10870(Fibonacci)](https://www.acmicpc.net/problem/10870)  
- [Solution](backjoon_step10/src/backjoon_10870/Main.java)  

#### [backjoon_2447(star)](https://www.acmicpc.net/problem/2447)  
- [Solution](backjoon_step10/src/backjoon_2447/Main.java)  
