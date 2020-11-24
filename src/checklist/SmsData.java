package checklist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsData {
	private int id; //번호
	private String text; //메시지 내용
	private String to;
	private int errorCode;
	private String sendTime;
}
