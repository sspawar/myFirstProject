package practiceprojectmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;																													
import java.util.stream.Collectors;

import practiceprojectLevel2.PracticeLevel2;
import practiceprojectLevel2.PracticeLevel2Pb1;

public class practice {
public static void main(String[] args) {
	practice p=new practice();
	String s="string";
	System.out.println(String.copyValueOf(p.encode(s)));
	}
	
public char[] encode(String strings) {
	String str="";
	if(strings.length()>=4)
	{
		str=strings.substring(3)+strings.substring(0, 3);
	}
	else
		str=strings;
		char[] chararray=str.toCharArray();
		char[] newCharArray = str.toCharArray();
		char[] newCharArray2 = new char[str.length()];
		int i=0;
		for(char ch:chararray){
			if(ch=='a')
			{
				newCharArray[i]='e';
				i++;
			     continue;
			}     
			else if(ch=='e')
			{	
				newCharArray[i]='i';
				i++;
				continue;
			}	
			else if(ch=='i'){
				newCharArray[i]='o';
				i++;
				continue;
			}
			else if(ch=='o'){
				newCharArray[i]='u';
				i++;
				continue;
			}
			else if(ch=='u'){
				newCharArray[i]='a';
				i++;
				continue;
			}
			else{
				newCharArray[i]=ch;
			}
			i++;
		}
		 for (int q=0; q<newCharArray.length; q++) 
			 newCharArray2[q] = newCharArray[q]; 
		int j=0;
		for(int k=str.length()-1;k>=0;k--){
			if(!isVowel(newCharArray[k])){
				for(;j<str.length();j++){
				if(!isVowel(newCharArray[j])){
					newCharArray2[j]=newCharArray[k];
					j++;
					break;
				}
				else
					continue;
				}
			}
			else
				continue;
		}
	return newCharArray2;
	}

public boolean isVowel(char ch){
	return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
	 
}
	
}
