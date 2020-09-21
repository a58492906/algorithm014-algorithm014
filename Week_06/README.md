1. 再此复习之前学习的递归，分治

* 递归代码模版：

public void recur(int level,int param){
     //terminator终止条件
    if (level>MAX_LEVEL){
     //process result
        return;
        }

    //process current logic当前层逻辑
    process(level,param);
    
    //drill down下层去
    recur(level:level+1,newparam);
    
    //restore currents status
}
*      3.分治模版

public void devide(string problem,int param){
     //recursion终止条件
    if (probelm is null){
        return result;}
     //prepare data
data =prepare_data(problem)
subProblem= spilt_problem(problem, data)
     
    //conquer subproblems
  subresult1=devide(subProblem[0],p1...)
  subresult2=devide(subProblem[1],p1…)
  subresult3=devide(subProblem[2],p1...)  
    //process and generate the final result
   
result =process_result(subresult1,subresult2,subresult3)
    
    //revert the current level states
}


* 实现关键点：

1.  拒绝人肉递归（重要）
2. 找到最近最简方法，将其拆解成可重复的问题
3. 利用数学归纳法的习惯
本质：寻找重复性->计算机本身只会if else和for循环的指令集

如果不熟悉可以画递归树：斐波那契树指数级的计算

动态规划：动态dynamic的编程法，也就是分治加上最优子结构的结合，将一个复杂的问题分解为简单的子问题。
每一步都保留最优的状态，同时用缓存来保存数据
1. 动态规划和递归或者分治没有根本上的区别（关键是看有没有最优子结构）
2. 共性：找到重复子问题
3. 差异性：最优子结构，中间可以淘汰次优解

实战例题：



1.斐波那契数列
傻递归方法：复杂度0（2^n）
 int fib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

加缓存的办法 :0（n）

 int fib(int n,int[]meo) {
        if (n <= 1) {
            return n;
        } 
        if(meo[n]==0){
            meo[n]=meo[n - 1] + meo[n - 2];
        }
        return meo[n];
    }

递推的方法（自底向上的方法）：
int fib(int n,int[]meo) {
    if (n <= 1) {
        return n;
    }
    int a[]=new int[n];
    for(int i=2;i<=n;i++){
        a[i]=a[i-1]+a[i-2];
    }
    return a[n];
}



2.路径计数

首先分解问题，把大棋盘分解为周围一格的走法，自定而下
然后自底向上来解决问题
递推公式(状态转移方程，Dp方程)：
opt[i,j]=opt[i+1,j]+opt[i,j+1]
完整的逻辑：
if a[i,j]='空地'：
opt[i,j]=opt[i+1,j]+opt[i,j+1]
else 
    opt[i,j]=0


动态规划要点：


1.最优子结构：opt[n]=best_of(opt[n-1],opt[n-2])
2.储存中间状态：opt[i]
3递推公式
fib：opt[I]=opt[I-1]+opt[I-2]
二维路径：opt[i,j]=opt[I+1,j]+opt[I,j+1]且判断a[I,j]是否为空地
