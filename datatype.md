##StockMarketData
>url: <http://apistore.baidu.com/apiworks/servicedetail/115.html>
>
>请求url: http://apis.baidu.com/apistore/stockservice/stock?stockid=sz002230&list=1
>请求方法 :GET
>请求参数(header) :
>apikey
>请求参数(urlParam) :
>stockid
>string
>股票ID，最多查询10支股票代码，多于10支则查前10支，股票代码请自行查阅股市大盘，如果list=1，则可以查询多支股票，用逗号（,）隔开
>展开	
>sz002230
>list
>string	是	urlParam	
>是否一次查询多值股票。list=1:一次查询多支股票，list=其它，则一次查询一直股票。
>展开	
>1
>{
>  errNum: 0,     //返回错误码
>  errMsg: "成功", //返回错误信息
>  retData: {
>      stockinfo: {
>      name: "科大讯飞", //股票名称
>      code: "sz002230", //股票代码，SZ指在深圳交易的股票
>      date: "2014-09-22", //当前显示股票信息的日期
>      time: "09:26:11",   //具体时间
>      OpenningPrice: 27.34, //今日开盘价
>      closingPrice: 27.34,  //昨日收盘价
>      currentPrice: 27.34,  //当前价格
>      hPrice: 27.34,        //今日最高价
>      lPrice: 27.34,       //今日最低价
>      competitivePrice: 27.30, //买一报价
>      auctionPrice: 27.34,   //卖一报价
>      totalNumber: 47800,    //成交的股票数
>      turnover: 1306852.00,  //成交额，以元为单位
>      buyOne: 6100,      //买一 
>      buyOnePrice: 27.30, //买一价格
>      buyTwo: 7500,  //买二
>      buyTwoPrice: 27.29, //买二价格
>      buyThree: 2000,   //买三
>      buyThreePrice: 27.27,  //买三价格
>      buyFour: 100,    //买四
>      buyFourPrice: 27.25, //买四价格
>      buyFive: 5700,     //买五
>      buyFivePrice: 27.22,  //买五价格
>      sellOne: 10150,       //卖一
>      sellOnePrice: 27.34,  //卖一价格
>      sellTwo: 15200,      //卖二
>      sellTwoPrice: 27.35,  //卖二价格
>      sellThree: 5914,     //卖三
>      sellThreePrice: 27.36, //卖三价格
>      sellFour: 400,        //卖四
>      sellFourPrice: 27.37,  //卖四价格
>      sellFive: 3000,       //卖五
>      sellFivePrice: 27.38   //卖五价格
>   },
>   market: {    //大盘指数
>      shanghai: {
>          name: "上证指数",
>          curdot: 2323.554, // 当前价格
>          curprice: -5.897,  //当前价格涨幅
>          rate: -0.25,    // 涨幅率
>          dealnumber: 11586,  //交易量，单位为手（一百股）
>          turnover: 98322   //成交额，万元为单位
>      },
>     shenzhen: {
>          name: "深证成指",
>          curdot: 8036.871,
>          curprice: -10.382,
>          rate: -0.13,
>          dealnumber: 1083562,
>          turnover: 126854
>      }
>   },
>   klinegraph: {  //K线图
>       minurl: "http://image.sinajs.cn/newchart/min/n/sz002230.gif", //分时K线图
>       dayurl: "http://image.sinajs.cn/newchart/daily/n/sz002230.gif", //日K线图
>       weekurl: "http://image.sinajs.cn/newchart/weekly/n/sz002230.gif", //周K线图
>       monthurl: "http://image.sinajs.cn/newchart/monthly/n/sz002230.gif" //月K线图
>   }
>  }
>}

##StockInformation
>url: <http://apistore.baidu.com/apiworks/servicedetail/1033.html>
>
>secID	string	证券ID
>ticker	string	交易代码
>exchangeCD	string	交易市场
>ListSectorCD	int32	上市板块编码
>ListSector	string	上市板块
>transCurrCD	string	交易货币
>secShortName	string	证券简称
>secFullName	string	证券全称
>listStatusCD	string	上市状态
>listDate	date	上市日期
>delistDate	date	摘牌日期
>equTypeCD	string	股票分类编码
>equType	string	股票类别
>exCountryCD	string	交易市场所属地区
>partyID	int64	机构内部ID
>totalShares	double	总股本(最新)
>nonrestFloatShares	Double	公司无限售流通股份合计(最新)
>nonrestfloatA	double	无限售流通股本(最新)。如果为A股，该列为最新无限售流通A股股本数量；如果为B股，该列为最新流通B股股本数量
>officeAddr	String	办公地址
>primeOperating	text	主营业务范围

##Stock
>url: <http://apistore.baidu.com/apiworks/servicedetail/1032.html>
>
>grossProfitLY	double	上年同期主营业务利润
>primeOperRevLY	double	上年同期主营业务收入
>TProfitLY	double	上年同期利润总额
>ROEWLY	double	上年同期加权平均净资产收益率(%)
>EPSWLY	double	上年同期加权平均每股收益(元/股)
>basicEPSLY	double	上年同期基本每股收益(元/股)
>NIncomeAttrPLY	double	上年同期归属于母公司所有者的净利润(若公司未披露该科目，则为净利润数据)
>NIncomeCutLY	double	上年同期扣除非经常性损益后净利润（若公司快报中仅披露扣除非经常性损益后归属于上市公司股东的净利润，则该科目为扣除非经常性损益后归属于上市公司股东的净利润）
>ROECutWLY	double	上年同期扣除非经常性损益后的加权平均净资产收益率(%)
>ROECutLY	double	上年同期扣除非经常性损益的期末净资产收益率(%)
>EPSCutWLY	double	上年同期扣除非经常损益后的加权每股收益(元/股)
>EPSCutLY	double	上年同期扣除非经常损益后的基本每股收益(元/股)
>ROELY	double	上年同期期末净资产收益率(%)
>NCfOperAPsLY	double	上年同期每股经营活动现金流量净额(元/股)
>NCfOperALY	double	上年同期经营活动现金流量净额
>operProfitLY	double	上年同期营业利润
>revenueLY	double	上年同期营业收入
>grossProfit	double	主营业务利润
>grossProfitYOY	double	主营业务利润同比(%)
>primeOperRev	double	主营业务收入
>primeOperRevYOY	double	主营业务收入同比(%)
>ticker	string	交易代码
>exchangeCD	string	交易所代码
>accoutingStandards	string	会计准则
>fiscalPeriod	string	会计期间
>ROE	double	全面摊薄净资产收益率(%)
>partyID	int64	公司代码
>TProfit	double	利润总额
>TProfitYOY	double	利润总额同比(%)
>ROEW	double	加权平均净资产收益率(%)
>ROEWYOY	double	加权平均净资产收益率同比(%)
>EPSW	double	加权平均每股收益(元/股)
>EPSWYOY	double	加权平均每股收益同比(%)
>publishDate	date	发布日期
>mergedFlag	string	合并标志
>basicEPS	double	基本每股收益(元/股)
>basicEPSYOY	double	基本每股收益同比(%)
>actPubtime	string	实际发布时间
>TEquityAttrP	double	归属于母公司所有者权益合计
>TEquityAttrPYOY	double	归属于母公司所有者权益同比(%)
>NIncomeAttrP	double	归属于母公司所有者的净利润(若公司未披露该科目，则为净利润数据)
>NIncomeAttrPYOY	double	归属于母公司所有者的净利润同比(%)(若公司未披露该科目，则为净利润数据)
>TAssets	double	总资产
>TAssetsYOY	double	总资产同比(%)
>endDate	date	截止日期
>NIncomeCut	double	扣除非经常性损益后净利润
>NIncomeCutYOY	double	扣除非经常性损益后净利润同比(%)
>ROECutW	double	扣除非经常性损益后的加权平均净资产收益率(%)
>ROECutWYOY	double	扣除非经常性损益后的加权平均净资产收益率同比(%)
>ROECut	double	扣除非经常性损益的全面摊薄净资产收益率(%)
>ROECutYOY	double	扣除非经常性损益的期末净资产收益率同比(%)
>EPSCutW	double	扣除非经常损益后的加权每股收益(元/股)
>EPSCutWYOY	double	扣除非经常损益后的加权每股收益同比(%)
>EPSCut	double	扣除非经常损益后的基本每股收益(元/股)
>EPSCutYOY	double	扣除非经常损益后的基本每股收益同比(%)
>reportType	string	报告类型
>TEquityAttrPLY	double	期初归属于母公司所有者权益合计
>TAssetsLY	double	期初总资产
>NAssetPsLY	double	期初每股净资产(元)
>ROEYOY	double	期末净资产收益率同比(%)
>NAssetPS	double	每股净资产(元)
>NAssetPsYOY	double	每股净资产同比(%)
>NCfOperAPs	double	每股经营活动现金流量净额(元/股)
>NCfOperAPsYOY	double	每股经营活动现金流量净额同比(%)
>NCfOperA	double	经营活动现金流量净额
>NCFOperAYOY	double	经营活动现金流量净额同比(%)
>paidInCapital	double	股本
>operateProfit	double	营业利润
>operProfitYOY	double	营业利润同比(%)
>revenue	double	营业收入
>revenueYOY	double	营业收入同比(%)
>secID	string	证券内部编码
>secShortName	string	证券简称
>currencyCD	string	货币

##Future&Option
>暂时没有找到直接免费的源，Femas可以在比赛的时候由虚拟盘，实际的话可以用CTP的接口来辅助获取行情
>From FemasApi
```
struct CUstpFtdcDepthMarketDataField
{
	///交易日
	TUstpFtdcDateType	TradingDay;
	///结算组代码
	TUstpFtdcSettlementGroupIDType	SettlementGroupID;
	///结算编号
	TUstpFtdcSettlementIDType	SettlementID;
	///昨结算
	TUstpFtdcPriceType	PreSettlementPrice;
	///昨收盘
	TUstpFtdcPriceType	PreClosePrice;
	///昨持仓量
	TUstpFtdcLargeVolumeType	PreOpenInterest;
	///昨虚实度
	TUstpFtdcRatioType	PreDelta;
	///今开盘
	TUstpFtdcPriceType	OpenPrice;
	///最高价
	TUstpFtdcPriceType	HighestPrice;
	///最低价
	TUstpFtdcPriceType	LowestPrice;
	///今收盘
	TUstpFtdcPriceType	ClosePrice;
	///涨停板价
	TUstpFtdcPriceType	UpperLimitPrice;
	///跌停板价
	TUstpFtdcPriceType	LowerLimitPrice;
	///今结算
	TUstpFtdcPriceType	SettlementPrice;
	///今虚实度
	TUstpFtdcRatioType	CurrDelta;
	///最新价
	TUstpFtdcPriceType	LastPrice;
	///数量
	TUstpFtdcVolumeType	Volume;
	///成交金额
	TUstpFtdcMoneyType	Turnover;
	///持仓量
	TUstpFtdcLargeVolumeType	OpenInterest;
	///申买价一
	TUstpFtdcPriceType	BidPrice1;
	///申买量一
	TUstpFtdcVolumeType	BidVolume1;
	///申卖价一
	TUstpFtdcPriceType	AskPrice1;
	///申卖量一
	TUstpFtdcVolumeType	AskVolume1;
	///申买价二
	TUstpFtdcPriceType	BidPrice2;
	///申买量二
	TUstpFtdcVolumeType	BidVolume2;
	///申买价三
	TUstpFtdcPriceType	BidPrice3;
	///申买量三
	TUstpFtdcVolumeType	BidVolume3;
	///申卖价二
	TUstpFtdcPriceType	AskPrice2;
	///申卖量二
	TUstpFtdcVolumeType	AskVolume2;
	///申卖价三
	TUstpFtdcPriceType	AskPrice3;
	///申卖量三
	TUstpFtdcVolumeType	AskVolume3;
	///申买价四
	TUstpFtdcPriceType	BidPrice4;
	///申买量四
	TUstpFtdcVolumeType	BidVolume4;
	///申买价五
	TUstpFtdcPriceType	BidPrice5;
	///申买量五
	TUstpFtdcVolumeType	BidVolume5;
	///申卖价四
	TUstpFtdcPriceType	AskPrice4;
	///申卖量四
	TUstpFtdcVolumeType	AskVolume4;
	///申卖价五
	TUstpFtdcPriceType	AskPrice5;
	///申卖量五
	TUstpFtdcVolumeType	AskVolume5;
	///合约代码
	TUstpFtdcInstrumentIDType	InstrumentID;
	///最后修改时间
	TUstpFtdcTimeType	UpdateTime;
	///最后修改毫秒
	TUstpFtdcMillisecType	UpdateMillisec;
};
```