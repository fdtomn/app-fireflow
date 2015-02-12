package org.fireflow.model.resource;

/**
 * 表单。
 * @author app
 *
 */
public class Form extends AbstractResource {
	/**
	 * 表单的地址。工作流引擎不处理该url，所以其格式只要业务系统能够解析即可。
	 */
	private String uri = null;
	private String editFields = null;
	private String hiddenFields = null;
	private String operateButtons = null;
	
	public String getOperateButtons() {
		return operateButtons;
	}

	public void setOperateButtons(String operateButtons) {
		this.operateButtons = operateButtons;
	}

	public String getEditFields() {
		return editFields;
	}

	public void setEditFields(String editFields) {
		this.editFields = editFields;
	}

	public String getHiddenFields() {
		return hiddenFields;
	}

	public void setHiddenFields(String hiddenFields) {
		this.hiddenFields = hiddenFields;
	}

	public Form(String name){
		this.setName(name);
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
	
	
}
