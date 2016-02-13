package cn.wyl1232792.fdp.datatype;

class LastValidDataType extends LimitedDataType {
	@Override
	void update(Object input)
	{
		this.setData(input);
	}
}
