package cn.wyl1232792.fdp.datatype;

class LimitedDataType extends DataType {
	
	Object getPreviousDataType()
	{
		return new LimitedDataType();
	}

	@Override
	void update(Object input) {
		//do nothing
	}

}
