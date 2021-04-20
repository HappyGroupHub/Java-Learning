package com.gmail.chiyc88.learning.midterm.grade1second;

public class Exam6Student {
    private String name;
    private int math;
    private int english;
    private int haha;

    //那這裡括弧裡面就是你要呼叫這個class的時候要填入的東西
    public Exam6Student(String name, int math, int english) { //這行就是在講說你呼叫的時候要做甚麼
        //好的接下來是你呼叫這個class有數值了對吧, 但是但是
        //他接收到這些東西譬如name好了, 只有在這個{}裡面
        //就有點像是你做這件事不會有用
        //剛剛有說這裡就像是main()一樣, class裡面一定會執行到這裡, 只要你呼叫他
        //所以為了要把上面的name, math, english 輸出去外面
        //我們上面要先建立變數
        //public private先不管 這個下次再教你
        //好反正現在他們有了
        //可是兩個命名都一樣怎麼辦
        //這時候就是this出廠的時候了
        //因為在這個{}裡, 我們輸入的name就會是 name
        //可是我們這個Class裡不是也有name嗎? 剛剛最一開始定義的
        //這時候就用this.name 來表示這個class的變數
        //也就是說, 我們把呼叫Exam6Student這個Class時, 需要輸入的name
        //順利的把他從這個{}移動到了這整個Class都讀的到

        this.name = name;
        this.english = english;                               //換一種講法就是
        this.math = math;                                     //普通Class的main(), 只要呼叫就會執行
    }

    public void print() {
        //既然現在得到name了
        //那就可以直接拿來使用了
        System.out.println("姓名:" + name + " 數學:" + math + " 英文:" + english);
        System.out.println(haha);
    }

    //你看這裡, 樓上haha不知道是為甚麼
    //因為haha這個變數只存在test()這個function裡
    //那要怎麼樣把它題出來呢?
    //我們要先在這個class定義haha
    //現在就不會有問題了
    //回到上面

    public void test() {
        int haha = 123;
    }

}


//接下來用Exam6 跟 Exam6Student 來講, 一樣, 前者是main() Class, 後者是普通的Class
//這題是再說請你呼叫一個class 並填入姓名, math score, english score
//然後再使用裡面的function印出來
//也就是跟你那題基本一模一樣的東西
//首先, 我們要讓你在乎叫這個class的時候填入數值