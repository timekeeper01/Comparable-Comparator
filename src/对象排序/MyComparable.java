package 对象排序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//使用comparable
public class MyComparable {

	public static void main(String[] args) {
		List<UserInfo> ls=new ArrayList<UserInfo>();
		ls.add(new UserInfo(1,43,"name1"));
		ls.add(new UserInfo(2,43,"name2"));
		ls.add(new UserInfo(3,42,"name3"));
		ls.add(new UserInfo(4,22,"name5"));
		ls.add(new UserInfo(5,31,"name1"));
		Collections.sort(ls);
		for(Object obj:ls) {
			System.out.println(obj);
		}

	}

}

class UserInfo implements Comparable<UserInfo>{
	private int userid;
	private int age;
	private String name;
	public UserInfo(int userid,int age,String name) {
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
	@Override
	public int compareTo(UserInfo o) {
		//按照年龄从小到大
		if(this.age-o.age==0)//如果年龄相同，则比较name
			return this.name.compareTo(o.name);
		else
			return this.age-o.age;
	}
	
}
