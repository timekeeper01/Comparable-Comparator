package 对象排序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparator {

	public static void main(String[] args) {
		List<UserInfo2> ls2=new ArrayList<UserInfo2>();
		ls2.add(new UserInfo2(1,43,"name1"));
		ls2.add(new UserInfo2(2,23,"name2"));
		ls2.add(new UserInfo2(3,42,"name3"));
		ls2.add(new UserInfo2(4,42,"name5"));
		ls2.add(new UserInfo2(5,31,"name1"));
		
		Comparator2 com=new Comparator2();//new一个比较器
		Collections.sort(ls2, com);
		for(Object obj:ls2)
			System.out.println(obj);
	}

}

class Comparator2 implements Comparator<UserInfo2>{
	@Override
	public int compare(UserInfo2 o1, UserInfo2 o2) {
		if(o1.getAge()-o2.getAge()==0)
			return o1.getName().compareTo(o2.getName());
		else
			return o1.getAge()-o2.getAge();
	}
	
}

class UserInfo2 {
	private int userid;
	private int age;
	private String name;
	public UserInfo2(int userid,int age,String name) {
		this.age=age;
		this.name=name;
		this.userid=userid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "UserInfo [userid=" + userid + ", age=" + age + ", name=" + name + "]";
	}
	
}

