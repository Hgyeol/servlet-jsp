package com.edu.customTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class MyCustomTag extends TagSupport{
	int cnt=1;
	
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int doStartTag() throws JspException {
		System.out.println("�����±׸� �������ϴ�");
		//return super.doStartTag();
		//return EVAL_BODY_INCLUDE;
		//return SKIP_BODY;
		System.out.println("color �Ӽ� �� : " + color);
		return EVAL_BODY_INCLUDE;
	}
	
	@Override
	public int doAfterBody() throws JspException {
		System.out.println("body ó���� �������ϴ� : " + cnt);
		//if(cnt++ < 10) return EVAL_BODY_AGAIN;
		//else return SKIP_BODY;
		//return super.doAfterBody();
		//return EVAL_BODY_AGAIN;
		//return SKIP_BODY;
		return super.doAfterBody();
	}
	
	@Override
	public int doEndTag() throws JspException {
		System.out.println("���±׸� �������ϴ�");
		//return super.doEndTag();
		return EVAL_PAGE;
		//return SKIP_PAGE;
	}
}
