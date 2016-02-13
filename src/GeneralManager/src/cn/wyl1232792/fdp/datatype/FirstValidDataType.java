package cn.wyl1232792.fdp.datatype;

class FirstValidDataType extends LimitedDataType {
	@Override
	void update(Object input) {
		if (!initialized) 
			this.setData(input);
	}
}