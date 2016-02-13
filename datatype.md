##StockMarketData
>url: <http://apistore.baidu.com/apiworks/servicedetail/115.html>
>
>����url: http://apis.baidu.com/apistore/stockservice/stock?stockid=sz002230&list=1
>���󷽷� :GET
>�������(header) :
>apikey
>�������(urlParam) :
>stockid
>string
>��ƱID������ѯ10֧��Ʊ���룬����10֧���ǰ10֧����Ʊ���������в��Ĺ��д��̣����list=1������Բ�ѯ��֧��Ʊ���ö��ţ�,������
>չ��	
>sz002230
>list
>string	��	urlParam	
>�Ƿ�һ�β�ѯ��ֵ��Ʊ��list=1:һ�β�ѯ��֧��Ʊ��list=��������һ�β�ѯһֱ��Ʊ��
>չ��	
>1
>{
>  errNum: 0,     //���ش�����
>  errMsg: "�ɹ�", //���ش�����Ϣ
>  retData: {
>      stockinfo: {
>      name: "�ƴ�Ѷ��", //��Ʊ����
>      code: "sz002230", //��Ʊ���룬SZָ�����ڽ��׵Ĺ�Ʊ
>      date: "2014-09-22", //��ǰ��ʾ��Ʊ��Ϣ������
>      time: "09:26:11",   //����ʱ��
>      OpenningPrice: 27.34, //���տ��̼�
>      closingPrice: 27.34,  //�������̼�
>      currentPrice: 27.34,  //��ǰ�۸�
>      hPrice: 27.34,        //������߼�
>      lPrice: 27.34,       //������ͼ�
>      competitivePrice: 27.30, //��һ����
>      auctionPrice: 27.34,   //��һ����
>      totalNumber: 47800,    //�ɽ��Ĺ�Ʊ��
>      turnover: 1306852.00,  //�ɽ����ԪΪ��λ
>      buyOne: 6100,      //��һ 
>      buyOnePrice: 27.30, //��һ�۸�
>      buyTwo: 7500,  //���
>      buyTwoPrice: 27.29, //����۸�
>      buyThree: 2000,   //����
>      buyThreePrice: 27.27,  //�����۸�
>      buyFour: 100,    //����
>      buyFourPrice: 27.25, //���ļ۸�
>      buyFive: 5700,     //����
>      buyFivePrice: 27.22,  //����۸�
>      sellOne: 10150,       //��һ
>      sellOnePrice: 27.34,  //��һ�۸�
>      sellTwo: 15200,      //����
>      sellTwoPrice: 27.35,  //�����۸�
>      sellThree: 5914,     //����
>      sellThreePrice: 27.36, //�����۸�
>      sellFour: 400,        //����
>      sellFourPrice: 27.37,  //���ļ۸�
>      sellFive: 3000,       //����
>      sellFivePrice: 27.38   //����۸�
>   },
>   market: {    //����ָ��
>      shanghai: {
>          name: "��ָ֤��",
>          curdot: 2323.554, // ��ǰ�۸�
>          curprice: -5.897,  //��ǰ�۸��Ƿ�
>          rate: -0.25,    // �Ƿ���
>          dealnumber: 11586,  //����������λΪ�֣�һ�ٹɣ�
>          turnover: 98322   //�ɽ����ԪΪ��λ
>      },
>     shenzhen: {
>          name: "��֤��ָ",
>          curdot: 8036.871,
>          curprice: -10.382,
>          rate: -0.13,
>          dealnumber: 1083562,
>          turnover: 126854
>      }
>   },
>   klinegraph: {  //K��ͼ
>       minurl: "http://image.sinajs.cn/newchart/min/n/sz002230.gif", //��ʱK��ͼ
>       dayurl: "http://image.sinajs.cn/newchart/daily/n/sz002230.gif", //��K��ͼ
>       weekurl: "http://image.sinajs.cn/newchart/weekly/n/sz002230.gif", //��K��ͼ
>       monthurl: "http://image.sinajs.cn/newchart/monthly/n/sz002230.gif" //��K��ͼ
>   }
>  }
>}

##StockInformation
>url: <http://apistore.baidu.com/apiworks/servicedetail/1033.html>
>
>secID	string	֤ȯID
>ticker	string	���״���
>exchangeCD	string	�����г�
>ListSectorCD	int32	���а�����
>ListSector	string	���а��
>transCurrCD	string	���׻���
>secShortName	string	֤ȯ���
>secFullName	string	֤ȯȫ��
>listStatusCD	string	����״̬
>listDate	date	��������
>delistDate	date	ժ������
>equTypeCD	string	��Ʊ�������
>equType	string	��Ʊ���
>exCountryCD	string	�����г���������
>partyID	int64	�����ڲ�ID
>totalShares	double	�ܹɱ�(����)
>nonrestFloatShares	Double	��˾��������ͨ�ɷݺϼ�(����)
>nonrestfloatA	double	��������ͨ�ɱ�(����)�����ΪA�ɣ�����Ϊ������������ͨA�ɹɱ����������ΪB�ɣ�����Ϊ������ͨB�ɹɱ�����
>officeAddr	String	�칫��ַ
>primeOperating	text	��Ӫҵ��Χ

##Stock
>url: <http://apistore.baidu.com/apiworks/servicedetail/1032.html>
>
>grossProfitLY	double	����ͬ����Ӫҵ������
>primeOperRevLY	double	����ͬ����Ӫҵ������
>TProfitLY	double	����ͬ�������ܶ�
>ROEWLY	double	����ͬ�ڼ�Ȩƽ�����ʲ�������(%)
>EPSWLY	double	����ͬ�ڼ�Ȩƽ��ÿ������(Ԫ/��)
>basicEPSLY	double	����ͬ�ڻ���ÿ������(Ԫ/��)
>NIncomeAttrPLY	double	����ͬ�ڹ�����ĸ��˾�����ߵľ�����(����˾δ��¶�ÿ�Ŀ����Ϊ����������)
>NIncomeCutLY	double	����ͬ�ڿ۳��Ǿ������������������˾�챨�н���¶�۳��Ǿ������������������й�˾�ɶ��ľ�������ÿ�ĿΪ�۳��Ǿ������������������й�˾�ɶ��ľ�����
>ROECutWLY	double	����ͬ�ڿ۳��Ǿ����������ļ�Ȩƽ�����ʲ�������(%)
>ROECutLY	double	����ͬ�ڿ۳��Ǿ������������ĩ���ʲ�������(%)
>EPSCutWLY	double	����ͬ�ڿ۳��Ǿ��������ļ�Ȩÿ������(Ԫ/��)
>EPSCutLY	double	����ͬ�ڿ۳��Ǿ��������Ļ���ÿ������(Ԫ/��)
>ROELY	double	����ͬ����ĩ���ʲ�������(%)
>NCfOperAPsLY	double	����ͬ��ÿ�ɾ�Ӫ��ֽ���������(Ԫ/��)
>NCfOperALY	double	����ͬ�ھ�Ӫ��ֽ���������
>operProfitLY	double	����ͬ��Ӫҵ����
>revenueLY	double	����ͬ��Ӫҵ����
>grossProfit	double	��Ӫҵ������
>grossProfitYOY	double	��Ӫҵ������ͬ��(%)
>primeOperRev	double	��Ӫҵ������
>primeOperRevYOY	double	��Ӫҵ������ͬ��(%)
>ticker	string	���״���
>exchangeCD	string	����������
>accoutingStandards	string	���׼��
>fiscalPeriod	string	����ڼ�
>ROE	double	ȫ��̯�����ʲ�������(%)
>partyID	int64	��˾����
>TProfit	double	�����ܶ�
>TProfitYOY	double	�����ܶ�ͬ��(%)
>ROEW	double	��Ȩƽ�����ʲ�������(%)
>ROEWYOY	double	��Ȩƽ�����ʲ�������ͬ��(%)
>EPSW	double	��Ȩƽ��ÿ������(Ԫ/��)
>EPSWYOY	double	��Ȩƽ��ÿ������ͬ��(%)
>publishDate	date	��������
>mergedFlag	string	�ϲ���־
>basicEPS	double	����ÿ������(Ԫ/��)
>basicEPSYOY	double	����ÿ������ͬ��(%)
>actPubtime	string	ʵ�ʷ���ʱ��
>TEquityAttrP	double	������ĸ��˾������Ȩ��ϼ�
>TEquityAttrPYOY	double	������ĸ��˾������Ȩ��ͬ��(%)
>NIncomeAttrP	double	������ĸ��˾�����ߵľ�����(����˾δ��¶�ÿ�Ŀ����Ϊ����������)
>NIncomeAttrPYOY	double	������ĸ��˾�����ߵľ�����ͬ��(%)(����˾δ��¶�ÿ�Ŀ����Ϊ����������)
>TAssets	double	���ʲ�
>TAssetsYOY	double	���ʲ�ͬ��(%)
>endDate	date	��ֹ����
>NIncomeCut	double	�۳��Ǿ��������������
>NIncomeCutYOY	double	�۳��Ǿ��������������ͬ��(%)
>ROECutW	double	�۳��Ǿ����������ļ�Ȩƽ�����ʲ�������(%)
>ROECutWYOY	double	�۳��Ǿ����������ļ�Ȩƽ�����ʲ�������ͬ��(%)
>ROECut	double	�۳��Ǿ����������ȫ��̯�����ʲ�������(%)
>ROECutYOY	double	�۳��Ǿ������������ĩ���ʲ�������ͬ��(%)
>EPSCutW	double	�۳��Ǿ��������ļ�Ȩÿ������(Ԫ/��)
>EPSCutWYOY	double	�۳��Ǿ��������ļ�Ȩÿ������ͬ��(%)
>EPSCut	double	�۳��Ǿ��������Ļ���ÿ������(Ԫ/��)
>EPSCutYOY	double	�۳��Ǿ��������Ļ���ÿ������ͬ��(%)
>reportType	string	��������
>TEquityAttrPLY	double	�ڳ�������ĸ��˾������Ȩ��ϼ�
>TAssetsLY	double	�ڳ����ʲ�
>NAssetPsLY	double	�ڳ�ÿ�ɾ��ʲ�(Ԫ)
>ROEYOY	double	��ĩ���ʲ�������ͬ��(%)
>NAssetPS	double	ÿ�ɾ��ʲ�(Ԫ)
>NAssetPsYOY	double	ÿ�ɾ��ʲ�ͬ��(%)
>NCfOperAPs	double	ÿ�ɾ�Ӫ��ֽ���������(Ԫ/��)
>NCfOperAPsYOY	double	ÿ�ɾ�Ӫ��ֽ���������ͬ��(%)
>NCfOperA	double	��Ӫ��ֽ���������
>NCFOperAYOY	double	��Ӫ��ֽ���������ͬ��(%)
>paidInCapital	double	�ɱ�
>operateProfit	double	Ӫҵ����
>operProfitYOY	double	Ӫҵ����ͬ��(%)
>revenue	double	Ӫҵ����
>revenueYOY	double	Ӫҵ����ͬ��(%)
>secID	string	֤ȯ�ڲ�����
>secShortName	string	֤ȯ���
>currencyCD	string	����

##Future&Option
>��ʱû���ҵ�ֱ����ѵ�Դ��Femas�����ڱ�����ʱ���������̣�ʵ�ʵĻ�������CTP�Ľӿ���������ȡ����
>From FemasApi
```
struct CUstpFtdcDepthMarketDataField
{
	///������
	TUstpFtdcDateType	TradingDay;
	///���������
	TUstpFtdcSettlementGroupIDType	SettlementGroupID;
	///������
	TUstpFtdcSettlementIDType	SettlementID;
	///�����
	TUstpFtdcPriceType	PreSettlementPrice;
	///������
	TUstpFtdcPriceType	PreClosePrice;
	///��ֲ���
	TUstpFtdcLargeVolumeType	PreOpenInterest;
	///����ʵ��
	TUstpFtdcRatioType	PreDelta;
	///����
	TUstpFtdcPriceType	OpenPrice;
	///��߼�
	TUstpFtdcPriceType	HighestPrice;
	///��ͼ�
	TUstpFtdcPriceType	LowestPrice;
	///������
	TUstpFtdcPriceType	ClosePrice;
	///��ͣ���
	TUstpFtdcPriceType	UpperLimitPrice;
	///��ͣ���
	TUstpFtdcPriceType	LowerLimitPrice;
	///�����
	TUstpFtdcPriceType	SettlementPrice;
	///����ʵ��
	TUstpFtdcRatioType	CurrDelta;
	///���¼�
	TUstpFtdcPriceType	LastPrice;
	///����
	TUstpFtdcVolumeType	Volume;
	///�ɽ����
	TUstpFtdcMoneyType	Turnover;
	///�ֲ���
	TUstpFtdcLargeVolumeType	OpenInterest;
	///�����һ
	TUstpFtdcPriceType	BidPrice1;
	///������һ
	TUstpFtdcVolumeType	BidVolume1;
	///������һ
	TUstpFtdcPriceType	AskPrice1;
	///������һ
	TUstpFtdcVolumeType	AskVolume1;
	///����۶�
	TUstpFtdcPriceType	BidPrice2;
	///��������
	TUstpFtdcVolumeType	BidVolume2;
	///�������
	TUstpFtdcPriceType	BidPrice3;
	///��������
	TUstpFtdcVolumeType	BidVolume3;
	///�����۶�
	TUstpFtdcPriceType	AskPrice2;
	///��������
	TUstpFtdcVolumeType	AskVolume2;
	///��������
	TUstpFtdcPriceType	AskPrice3;
	///��������
	TUstpFtdcVolumeType	AskVolume3;
	///�������
	TUstpFtdcPriceType	BidPrice4;
	///��������
	TUstpFtdcVolumeType	BidVolume4;
	///�������
	TUstpFtdcPriceType	BidPrice5;
	///��������
	TUstpFtdcVolumeType	BidVolume5;
	///��������
	TUstpFtdcPriceType	AskPrice4;
	///��������
	TUstpFtdcVolumeType	AskVolume4;
	///��������
	TUstpFtdcPriceType	AskPrice5;
	///��������
	TUstpFtdcVolumeType	AskVolume5;
	///��Լ����
	TUstpFtdcInstrumentIDType	InstrumentID;
	///����޸�ʱ��
	TUstpFtdcTimeType	UpdateTime;
	///����޸ĺ���
	TUstpFtdcMillisecType	UpdateMillisec;
};
```