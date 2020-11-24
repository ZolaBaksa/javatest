package checklist;

public class Response {
	String group_id;
	String error_list;
	String succes_count;
	String error_count;
	
	public static void main(String[] args) {
		String data = "{\"group_id\":\"R2GDRz5kRfGs6Gcx\",\"error_list\":{\"1\":\"1062\"},\"success_count\":0,\"error_count\":1}";
				
		Response res = new Response();
		
		System.out.println(data.indexOf("{"));
		System.out.println(data.lastIndexOf("}"));
	}
}
