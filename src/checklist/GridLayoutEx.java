package checklist;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class GridLayoutEx extends JFrame {

	static void ��������(String to, String text) {
		String api_key = "NCSAWS0DUE3LIRIM";
		String api_secret = "NJON2BBFG3R0GLJERXPFSO6IDN7LAW7V";
		Message coolsms = new Message(api_key, api_secret);

		// 4 params(to, from, type, text) are mandatory. must be filled
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", to);
		params.put("from", "01077433139");
		params.put("type", "SMS");
		params.put("text", text);
		params.put("app_version", "test app 1.2"); // application name and version

		try {
			JSONObject obj = (JSONObject) coolsms.send(params);
			System.out.println("�޽����� ���۵Ǿ����ϴ�.");
			System.out.println(obj.toString());
		} catch (CoolsmsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
		}
	}

	private JPanel jp1;
	private JLabel laName, laNum;
	private JTextField tfName, tfNum;
	private JButton btn1;
	Container c;

	public GridLayoutEx() {
		setTitle("GridLayout Sample");
		// X��ư Ŭ���ϸ� main�� �����.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

		// 4x2 ������ GridLayout ��ġ������ ����

		// �ʿ��� ������Ʈ�� �޸𸮿� �ε�
		initObject();
		// ��ġ������ ����
		initSetting();

		initBatch();
//btn1.addActionListener(new ActionListner() {
//	public void actionPerformed(ActionEvent e) {
//		��������(tfName.getText(), tfNum.getText());
//	}
//});
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				��������(tfName.getText(), tfNum.getText());
			}
		});

		setVisible(true);
	}

	private void initBatch() {
		c.add(laName);
		c.add(tfName);
		c.add(laNum);
		c.add(tfNum);
		c.add(btn1);

	}

	private void initSetting() {
		c = getContentPane();
		GridLayout grid = new GridLayout(3, 2);
		grid.setVgap(5); // ������ ���� ������ 5�ȼ��� ����
		c.setLayout(grid); // grid�� ����Ʈ���� ��ġ�����ڷ� ����
	}

	private void initObject() {
		laName = new JLabel("��ȭ��ȣ");
		laNum = new JLabel("�޽���");
		tfName = new JTextField("");
		tfNum = new JTextField("");
		btn1 = new JButton("����");
	}

	public static void main(String[] args) {
		new GridLayoutEx();
	}

}