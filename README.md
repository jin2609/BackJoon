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
- [Solution](kakao_15955/src/kakao_15955/Main.java) : USe disjoint-set  
- I have used several methods to solve this problem.  
First, I used dynamic programming and greedy method. But I can see timeout, and memory exceeded error. So, I think diffrents way that is dijkstra.
Second, I used dijkstra algorithm. But the result was the same.  
- This problem is quite difficult. I solved this problem using disjoint-set.  
The disadvantage of disjoint-set is that it is difficult to separate groups. If life comes in ascending order, nothing happens to separate. So I made a class with an x coordinate, a y coordinate, and a problem number. Then, to receive the question, I made a class that has start point, finish point, life, and problem number. The questions were arranged in ascending order of life. And whenever the value of life changed, it Added a set.  
I defined a class called Pair to align the points with the x- and y-coordinates to form a pair and put them in an array. The class has the number and distance of points. If made that way, there will be a total of 2N-2 pairs. The pairs were arranged in ascending order. If so, there are many benefits of time-complexity because it is not necessary to look at pairs that are not required when life changes.
------------------------------------------------------------------------
### 2020.1.17  
#### [kakao_15955(Booster)](https://www.acmicpc.net/problem/1018)  
- [Solution](backjoon_1018/src/backjoon_1018/Main.java) : Use for-statements  
- This problem was difficult to understand. But I understand that it was easy to solve. I used iterative sentences to calculate a rectangle divided into eight squares. The color of the upper left column was divided into black and white to find the minimum value.
------------------------------------------------------------------------
