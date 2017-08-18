import java.util.*;
class Anag
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enter the first string");
String str1=scan.nextLine();
System.out.println("enter the second string");
String str2=scan.nextLine();

int n1=str1.length();
int n2=str2.length();

char word1[]=new char[n1];
char word2[]=new char[n2];

for(int i=0; i<n1; i++)
{
word1[i]=str1.charAt(i);
}

for(int i=0; i<n2; i++)
{
word2[i]=str2.charAt(i);
}

/*for(int i=0; i<n1; i++)
{
for(int j=0; j<n2; j++)
{
if(word1[i]==word2[j])
{
word2[j]='';
}
}
}*/

for(int i=0; i<n1; i++)
{
int conv1=str1.charAt(i);
 
if(conv1>64 && conv1<91)
{
conv1=conv1+32;
}

word1[i]=(char)conv1;
}
System.out.println(word1);


for(int i=0; i<n2; i++)
{
int conv2=str2.charAt(i);
 
if(conv2>64 && conv2<91)
{
conv2=conv2+32;
}

word2[i]=(char)conv2;
}
System.out.println(word2);


for(int i=0; i<n1-1; i++)
{
for(int j=i+1; j<n1; j++)
{
if(word1[j]<word1[i])
{
char c=word1[j];
word1[j]=word1[i];
word1[i]=c;
}
}
}
System.out.println(word1);

for(int i=0; i<n2-1; i++)
{
for(int j=i+1; j<n2; j++)
{
if(word2[j]<word2[i])
{
char c=word2[j];
word2[j]=word2[i];
word2[i]=c;
}
}
}
System.out.println(word2);




if(word1.equals(word2))
{
System.out.println("Anagram");
}
else
{
System.out.println("not anagram");
}

}
}