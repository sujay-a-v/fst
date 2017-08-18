import java.util.*;
class SPG5
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enter the string");
String s=scan.nextLine();
int n=s.length();
int count=0;
String temp="";

for(int i=0; i<n; i++)
{
char c=s.charAt(i);

int charCount=1;
for(int j=i+1; j<n; j++)
{
char k1=s.charAt(j);

if( c==k1 && temp.indexOf(c)==-1)
{
charCount++;
}
}

if(temp.indexOf(c)==-1)
{
temp=temp+c;
System.out.print(c+""+charCount);



if( charCount%2!=0)
{
count=count+1;
}
}
}
System.out.println(count);



 if(count>1)
{
System.out.println("Palindrome not possiblr");
}
else
{

System.out.println("palindrome is possible");

char org[]=s.toCharArray();
char pal[]=new char[n];

//int n1=n/2;

for(int i=0; i<n; i++)
{
for(int j=i+1; j<n; j++)
{
if(org[j]<org[i])
{
char su=org[j];
org[j]=org[i];
org[i]=su;
}
}
}

System.out.println(org);
pal=org;
System.out.println(pal);

int n1=n/2;
int n2=n-1;
int k=0;
org[n1]=pal[n-1];
for(int i=0; i<n1; i++)
{
org[i]=pal[k];
org[n2]=pal[k+1];
k=k+2;
n2=n2-1;
}
//org[n1]=pal[n-1];
System.out.println(org);
//System.out.println(pal);
}

}
}



