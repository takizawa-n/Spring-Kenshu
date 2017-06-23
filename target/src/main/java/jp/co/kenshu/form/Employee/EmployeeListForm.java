package jp.co.kenshu.form.Employee;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import jp.co.kenshu.validator.annotation.Memo;

public class EmployeeListForm {

	//これを入力することによって、値がない場合をエラーにできる
	//エラーの表示は、jspにform:errorsタグを追加
	@NotEmpty
    private String name;
	@NotNull
	@Min(value = 18)
    private Integer age;
	@Memo(value = 50)
    private String memo;


    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//intは初期値が0なので、0が表示されてしまう
	//Integerなら初期値がnullで、nullは表示されないため
	//今回はIntegerを使用

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
}






