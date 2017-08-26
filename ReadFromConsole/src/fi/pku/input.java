package fi.pku;

import java.util.Scanner;
class input
{
public static void main(String[] args) 
{
/*int bin,p,q,r,x;
Scanner s=new Scanner(System.in);
System.out.println("How Many Row Do you want to input: ");
r=s.nextInt();
bin=1;
q=0;

System.out.print("Pascal's Triangle: ");

while(q<r)
{
for(p=40-3*q;p>0;--p)
System.out.print(" ");
for(x=0;x<=q;++x)
{
if((x==0)||(q==0))
bin=1;
else
bin=(bin*(q-x+1))/x;
System.out.print("      ");
System.out.print(bin);
}

System.out.println("");
++q;
}
*/
	//}

int s=7;
int k=1;
int r ;

for(int i=1;i<=s;i++){
    int num=1;
    r=i;
    int col=0;
    for(int j=1;j<=2*s-1;j++){

        if(j <= s-i)
        System.out.print("  ");
        else if(j >= s+i)
        System.out.print("  ");
        else{
            if(k%2 ==0){
                System.out.print("  ");

            }
            else{
                 if (col > 0) {
                     num = num * (r - col) / col;    
                 }

             System.out.print(num+" ");
                col++;
            }
        k++;
        }
    }
    System.out.println("");
    k=1;
}
}
}