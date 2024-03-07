package day4;

public class IDOperators
{
    public static void main(String[] args) {
        // 1. post increment [assign and then increment]
//        int a =1;
//        int b =a++;
//
//        System.out.println(a); // 2
//        System.out.println(b); // 1

//        int c =-99;
//        int d = c++;
//        System.out.println(c);// -98
//        System.out.println(d); // -99

//        int x =10;
//        int y =x++;
//        System.out.println(x);
//        System.out.println(y);

        //2. pre-increment [increment and then assign]

//        int t=1;
//        int u = ++t;
//        System.out.println(t);
//        System.out.println(u);

//        int k =-99;
//        int p= ++k;
//        System.out.println(k);
//        System.out.println(p);

//        int g = -1001;
//        int h = ++g;
//        System.out.println(g);
//        System.out.println(h);

//3 . post decrement
//        int s = 2;
//        int v = s--;
//        System.out.println(s);//1
//        System.out.println(v);//2
//
//        int l1= -999;
//        int l2= l1--;
//        System.out.println(l1);
//        System.out.println(l2);

// 4. pre decrement
//        int r1 = 2;
//        int r2 = --r1;
//        System.out.println(r1);
//        System.out.println(r2);

        //=======================================================

//        int num =10;
//        System.out.println(++num);
//        System.out.println(num);
//
//        float f = 2.5f;
//        float j = f++;
//        System.out.println(f);
//        System.out.println(j);

        int m =200;
        int n =m++;
//        System.out.println(--m); // 200 [ p =--m]
//        System.out.println(m);   // 200
//        System.out.println(m++); // 200[p = m++]
//        System.out.println(m--); // 201 [p = m--]
//        System.out.println(--m); // 199 [p = --m]
//        System.out.println(m);   // 199
//        System.out.println(n);   // 200

        System.out.println("============================================");
        int x = -200;
        int y = --x;

        System.out.println(--x); // -202
        System.out.println(x);   // -202
        System.out.println(x++); // -202
        System.out.println(x--); // -201
        System.out.println(--x);
        System.out.println(x);
        System.out.println(y);


    }
}
