import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("how much subject do you want to enter:");
    int num=sc.nextInt();
    int marks[]=new int[num];
    int sum=0;
    for(int i=0;i<marks.length;i++){
      System.out.println("enter marks of subject"+(i+1)+":");
      marks[i]=sc.nextInt();
      sum+=marks[i];
    }
    int percentage=(sum/num);
    if(percentage>=90){
      System.out.println("percentange is:"+percentage+"\ngrade is A");
      System.out.println("total marks are "+sum+"/"+num*100);
    }else if(percentage>=80 && percentage<90){
      System.out.println("percentange is:"+percentage+"\ngrade is B");
      System.out.println("total marks are "+sum+"/"+num*100);

    }else if(percentage>=70 && percentage<80){
      System.out.println("percentange is:"+percentage+"\ngrade is C");
      System.out.println("total marks are "+sum+"/"+num*100);
    }else if(percentage>=60 && percentage<70){
      System.out.println("percentange is:"+percentage+"\ngrade is D");
      System.out.println("total marks are "+sum+"/"+num*100);
    }else if(percentage>=33 && percentage<60){
      System.out.println("percnetange is:"+percentage+"\ngrade is E");
      System.out.println("total marks are "+sum+"/"+num*100);
    }else{
      System.out.println("you failed and grade is F");
      System.out.println("total marks are "+sum+"/"+ num*100);
    }
  }
}
