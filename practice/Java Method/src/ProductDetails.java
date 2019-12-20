
public class ProductDetails {
	private long Id;
	private String productName;
	private String supplierName;
	
	public long getId()
	{
		return Id;
	}
	public String getproductName()
	{
		return productName;
	}
	public String getsupplierName()
	{
		return supplierName;
	}
	public void setId(long Id)
	{
		this.Id=Id;
	}
	public void setproductName(String productName)
	{
		this.productName=productName;
	}
	public void setsupplierName(String supplierName)
	{
		this.supplierName=supplierName;
	}

}