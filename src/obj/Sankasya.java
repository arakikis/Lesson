package obj;

public class Sankasya {
	private String name;
	private int age;

	public Sankasya(String name, int age)throws SankasyaException {
		if(age<0) {
			throw new SankasyaException("年齢が不正です");
		}
		if(name.equals("")) {
			throw new SankasyaException("名前を入れてください");
		}

		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



}
