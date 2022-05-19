package org.company;

public class ClientInfo {
	public static void main(String[] args) {
		//Literal String
		String s="java";
		String s1="java";
		
		int hashCode=System.identityHashCode(s);
		System.out.println(hashCode);
		
		int hashCode2=System.identityHashCode(s1);
		System.out.println(hashCode2);
		
		System.out.println("======");
		
		//Non-Literal String
		String s2=new String("sql");
		String s3=new String("sql");
		
		int hashCode3=System.identityHashCode(s2);
		System.out.println(hashCode3);
		
		int hashCode4=System.identityHashCode(s3);
		System.out.println(hashCode4);
		
		System.out.println("=====");
		
		//Immutable String
		String s4=new String("dotnet");
		String s5=new String("dotnet");
		
		int hashCode5=System.identityHashCode(s4);
		System.out.println(hashCode5);
		
		int hashCode6=System.identityHashCode(s5);
		System.out.println(hashCode6);
		
		String concat = s4.concat(s5);
		System.out.println(concat);
		
		int hashCode7=System.identityHashCode(concat);
		System.out.println(hashCode7);
		
		System.out.println("=====");
		
		//mutuable String
		
		StringBuffer s6=new StringBuffer("phyton");
		StringBuffer s7=new StringBuffer("phyton");
		
		int hashCode8=System.identityHashCode(s6);
		System.out.println(hashCode8);
		
		int hashCode9=System.identityHashCode(s7);
		System.out.println(hashCode9);
		
		StringBuffer append=s6.append(s7);
		System.out.println(append);
		
		int hashCode10=System.identityHashCode(append);
		System.out.println(hashCode10);
		
		StringBuilder s8=new StringBuilder("maven");
		StringBuilder s9=new StringBuilder("maven");
		
		int hashCode11=System.identityHashCode(s8);
		System.out.println(hashCode11);
		
		int hashCode12=System.identityHashCode(s9);
		System.out.println(hashCode12);
		
		StringBuilder append=s8.append(s9);
		System.out.println(append);
		
		int hashCode13=System.identityHashCode(append);
		System.out.println(hashCode13);
		
		
		
			}

}
