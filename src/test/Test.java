package test;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.RowData;
import swing2swt.layout.BorderLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.widgets.List;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.widgets.Group;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.DateTime;
import swing2swt.layout.FlowLayout;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import swing2swt.layout.BoxLayout;
import org.eclipse.swt.widgets.TableColumn;

public class Test extends Dialog {

	protected Object result;
	protected Shell shell;
	private Text text_1;
	private Text text_4;
	private Text text_5;
	private Text text_6;
	private Text text_7;
	private Text text_8;
	private Text text_9;
	private Text text_10;
	private Text text_15;
	private Text text_16;
	private Text text_17;
	private Text text_18;
	private Text text_19;
	private Text text_20;
	private Text text_21;
	private Text text;
	private Table table;

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public Test(Shell parent, int style) {
		super(parent, style);
		setText("SWT Dialog");
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public Object open() {
		createContents();
		shell.open();
		shell.layout();
		Display display = getParent().getDisplay();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		shell = new Shell(getParent(), SWT.DIALOG_TRIM);
		shell.setSize(882, 673);
		shell.setText(getText());
		shell.setLayout(new BorderLayout(0, 0));
		
		TabFolder tabFolder = new TabFolder(shell, SWT.NONE);
		
		TabItem tabItem_2 = new TabItem(tabFolder, SWT.NONE);
		tabItem_2.setText("\u73B0 \u91D1 \u5238");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tabItem_2.setControl(composite);
		composite.setLayout(new GridLayout(7, false));
		
		Composite composite_4 = new Composite(composite, SWT.NONE);
		composite_4.setLayout(new GridLayout(3, false));
		composite_4.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 7, 1));
		
		Label lblNewLabel_2 = new Label(composite_4, SWT.NONE);
		lblNewLabel_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_2.setText("Logo");
		
		text = new Text(composite_4, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button btnNewButton = new Button(composite_4, SWT.NONE);
		btnNewButton.setSize(60, 27);
		btnNewButton.setText("\u4E0A\u4F20\u56FE\u7247");
		
		Group group_2 = new Group(composite, SWT.NONE);
		group_2.setText("\u6295\u653E\u95E8\u5E97");
		group_2.setLayout(new GridLayout(7, false));
		GridData gd_group_2 = new GridData(SWT.FILL, SWT.FILL, false, false, 4, 1);
		gd_group_2.widthHint = 328;
		group_2.setLayoutData(gd_group_2);
		
		Composite composite_5 = new Composite(group_2, SWT.NONE);
		composite_5.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 6, 2));
		composite_5.setBounds(0, 0, 64, 64);
		composite_5.setLayout(new GridLayout(1, false));
		
		ComboViewer comboViewer_2 = new ComboViewer(composite_5, SWT.NONE);
		Combo combo = comboViewer_2.getCombo();
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		ListViewer listViewer = new ListViewer(composite_5, SWT.BORDER | SWT.V_SCROLL);
		List list = listViewer.getList();
		GridData gd_list = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_list.widthHint = 200;
		list.setLayoutData(gd_list);
		
		Composite composite_7 = new Composite(group_2, SWT.NONE);
		composite_7.setLayout(new RowLayout(SWT.VERTICAL));
		composite_7.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 2));
		composite_7.setBounds(0, 0, 64, 64);
		
		Button btnNewButton_1 = new Button(composite_7, SWT.NONE);
		btnNewButton_1.setText("\u66F4\u65B0\u95E8\u5E97");
		
		Button btnNewButton_2 = new Button(composite_7, SWT.NONE);
		btnNewButton_2.setText("\u6DFB    \u52A0");
		
		Button btnNewButton_3 = new Button(composite_7, SWT.NONE);
		btnNewButton_3.setText("\u5220    \u9664");
		
		Group group_1 = new Group(composite, SWT.NONE);
		GridData gd_group_1 = new GridData(SWT.FILL, SWT.FILL, false, false, 3, 1);
		gd_group_1.widthHint = 79;
		group_1.setLayoutData(gd_group_1);
		group_1.setText("\u5361\u5238\u80CC\u666F\u8272");
		group_1.setLayout(new GridLayout(3, false));
		
		Button btnRadioButton = new Button(group_1, SWT.RADIO);
		btnRadioButton.setImage(SWTResourceManager.getImage(Test.class, "/test/2c9f67.gif"));
		btnRadioButton.setText("2c9f67");
		
		Button btnRadioButton_2 = new Button(group_1, SWT.RADIO);
		btnRadioButton_2.setImage(SWTResourceManager.getImage(Test.class, "/test/509fc9.gif"));
		btnRadioButton_2.setText("509fc9");
		
		Button btnRadioButton_1 = new Button(group_1, SWT.RADIO);
		btnRadioButton_1.setImage(SWTResourceManager.getImage(Test.class, "/test/5885cf.gif"));
		btnRadioButton_1.setText("5885cf");
		
		Button btnRadioButton_3 = new Button(group_1, SWT.RADIO);
		btnRadioButton_3.setImage(SWTResourceManager.getImage(Test.class, "/test/5E6671.gif"));
		btnRadioButton_3.setText("5885cf");
		
		Button btnRadioButton_4 = new Button(group_1, SWT.RADIO);
		btnRadioButton_4.setImage(SWTResourceManager.getImage(Test.class, "/test/63b359.gif"));
		btnRadioButton_4.setText("63b359");
		
		Button btnRadioButton_5 = new Button(group_1, SWT.RADIO);
		btnRadioButton_5.setImage(SWTResourceManager.getImage(Test.class, "/test/9062c0.gif"));
		btnRadioButton_5.setText("9062c0");
		
		Button btnRadioButton_8 = new Button(group_1, SWT.RADIO);
		btnRadioButton_8.setImage(SWTResourceManager.getImage(Test.class, "/test/a9d92d.gif"));
		btnRadioButton_8.setText("a9d92d");
		
		Button btnRadioButton_7 = new Button(group_1, SWT.RADIO);
		btnRadioButton_7.setImage(SWTResourceManager.getImage(Test.class, "/test/cc463d.gif"));
		btnRadioButton_7.setText("cc463d");
		
		Button btnRadioButton_6 = new Button(group_1, SWT.RADIO);
		btnRadioButton_6.setImage(SWTResourceManager.getImage(Test.class, "/test/cf3e36.gif"));
		btnRadioButton_6.setText("cf3e36");
		
		Button btnRadioButton_10 = new Button(group_1, SWT.RADIO);
		btnRadioButton_10.setImage(SWTResourceManager.getImage(Test.class, "/test/d09a45.gif"));
		btnRadioButton_10.setText("d09a45");
		
		Button btnRadioButton_9 = new Button(group_1, SWT.RADIO);
		btnRadioButton_9.setImage(SWTResourceManager.getImage(Test.class, "/test/dd6549.gif"));
		btnRadioButton_9.setText("dd6549");
		
		Button btnRadioButton_11 = new Button(group_1, SWT.RADIO);
		btnRadioButton_11.setImage(SWTResourceManager.getImage(Test.class, "/test/e4b138.gif"));
		btnRadioButton_11.setText("e4b138");
		
		Button btnRadioButton_12 = new Button(group_1, SWT.RADIO);
		btnRadioButton_12.setImage(SWTResourceManager.getImage(Test.class, "/test/ee903c.gif"));
		btnRadioButton_12.setText("ee903c");
		
		Button btnRadioButton_13 = new Button(group_1, SWT.RADIO);
		btnRadioButton_13.setImage(SWTResourceManager.getImage(Test.class, "/test/f08500.gif"));
		btnRadioButton_13.setText("f08500");
		new Label(group_1, SWT.NONE);
		
		Label lblNewLabel_3 = new Label(composite, SWT.NONE);
		lblNewLabel_3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_3.setText("\u626B\u7801\u7C7B\u578B");
		
		ComboViewer comboViewer_1 = new ComboViewer(composite, SWT.NONE);
		Combo combo_1 = comboViewer_1.getCombo();
		combo_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		
		Label lblNewLabel_8 = new Label(composite, SWT.NONE);
		lblNewLabel_8.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_8.setText("\u63CF    \u8FF0");
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		
		Label lblNewLabel_4 = new Label(composite, SWT.NONE);
		lblNewLabel_4.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_4.setText("\u54C1\u724C\u540D\u79F0");
		
		text_4 = new Text(composite, SWT.BORDER);
		text_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		
		text_8 = new Text(composite, SWT.BORDER | SWT.MULTI);
		text_8.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 3));
		
		Label lblNewLabel_5 = new Label(composite, SWT.NONE);
		lblNewLabel_5.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_5.setText("\u4E3B\u6807\u9898");
		
		text_5 = new Text(composite, SWT.BORDER);
		text_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		
		Label lblNewLabel_6 = new Label(composite, SWT.NONE);
		lblNewLabel_6.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_6.setText("\u526F\u6807\u9898");
		
		text_6 = new Text(composite, SWT.BORDER);
		text_6.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		
		Label lblNewLabel_7 = new Label(composite, SWT.NONE);
		lblNewLabel_7.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_7.setText("\u4F7F\u7528\u63D0\u793A");
		
		text_7 = new Text(composite, SWT.BORDER);
		text_7.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		
		Button btnRadioButton_15 = new Button(composite, SWT.RADIO);
		btnRadioButton_15.setText("\u81EA\u5B9A\u4E49\u5238\u53F7");
		
		Button button = new Button(composite, SWT.NONE);
		button.setText("\u5BFC\u5165\u5238\u53F7");
		new Label(composite, SWT.NONE);
		
		Composite composite_1 = new Composite(composite, SWT.NONE);
		composite_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		GridData gd_composite_1 = new GridData(SWT.FILL, SWT.FILL, false, false, 4, 1);
		gd_composite_1.widthHint = 123;
		composite_1.setLayoutData(gd_composite_1);
		
		Label lblNewLabel_9 = new Label(composite_1, SWT.NONE);
		lblNewLabel_9.setText("\u8D77\u59CB\u65E5\u671F");
		
		DateTime dateTime = new DateTime(composite_1, SWT.BORDER | SWT.LONG);
		
		Label lblNewLabel_10 = new Label(composite_1, SWT.NONE);
		lblNewLabel_10.setText("\u7ED3\u675F\u65E5\u671F");
		
		DateTime dateTime_1 = new DateTime(composite_1, SWT.BORDER | SWT.LONG);
		
		text_10 = new Text(composite, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		text_10.setText("");
		text_10.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 4));
		
		Button btnRadioButton_14 = new Button(composite, SWT.RADIO);
		btnRadioButton_14.setText("\u81EA\u52A8\u751F\u6210\u5238\u53F7\u6570");
		
		text_9 = new Text(composite, SWT.BORDER);
		text_9.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		
		ProgressBar progressBar = new ProgressBar(composite, SWT.NONE);
		progressBar.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 4, 1));
		
		Composite composite_2 = new Composite(composite, SWT.NONE);
		composite_2.setLayout(new GridLayout(2, false));
		composite_2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 7, 1));
		
		text_15 = new Text(composite_2, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.MULTI);
		text_15.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 3));
		new Label(composite_2, SWT.NONE);
		new Label(composite_2, SWT.NONE);
		
		Button btnNewButton_4 = new Button(composite_2, SWT.NONE);
		btnNewButton_4.setText("\u5F00\u59CB\u5236\u5238");
		
		TabItem tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("\u5220 \u9664 \u5238");
		
		Composite composite_6 = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem.setControl(composite_6);
		composite_6.setLayout(new GridLayout(1, false));
		
		CheckboxTableViewer checkboxTableViewer = CheckboxTableViewer.newCheckList(composite_6, SWT.BORDER | SWT.FULL_SELECTION);
		checkboxTableViewer.setColumnProperties(new String[] {});
		table = checkboxTableViewer.getTable();
		table.setSize(858, 536);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Composite composite_8 = new Composite(composite_6, SWT.NONE);
		composite_8.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		composite_8.setBounds(0, 0, 64, 64);
		composite_8.setLayout(new GridLayout(12, false));
		new Label(composite_8, SWT.NONE);
		new Label(composite_8, SWT.NONE);
		new Label(composite_8, SWT.NONE);
		new Label(composite_8, SWT.NONE);
		new Label(composite_8, SWT.NONE);
		new Label(composite_8, SWT.NONE);
		new Label(composite_8, SWT.NONE);
		new Label(composite_8, SWT.NONE);
		new Label(composite_8, SWT.NONE);
		new Label(composite_8, SWT.NONE);
		
		Button btnNewButton_5 = new Button(composite_8, SWT.NONE);
		btnNewButton_5.setText("\u5237\u65B0\u5361\u5238");
		
		Button btnNewButton_6 = new Button(composite_8, SWT.NONE);
		btnNewButton_6.setText("\u5220\u9664\u5361\u5238");
		
		TabItem tbtmCashCard = new TabItem(tabFolder, SWT.NONE);
		tbtmCashCard.setText("\u8BBE    \u7F6E");
		
		Composite composite_3 = new Composite(tabFolder, SWT.NONE);
		tbtmCashCard.setControl(composite_3);
		composite_3.setLayout(new GridLayout(1, false));
		
		Group group_3 = new Group(composite_3, SWT.NONE);
		group_3.setText("\u516C\u4F17\u53F7\u914D\u7F6E");
		group_3.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		group_3.setLayout(new GridLayout(2, false));
		
		Label lblNewLabel_15 = new Label(group_3, SWT.NONE);
		lblNewLabel_15.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_15.setText("appId");
		
		text_16 = new Text(group_3, SWT.BORDER);
		text_16.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_16 = new Label(group_3, SWT.NONE);
		lblNewLabel_16.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_16.setText("appSecret");
		
		text_17 = new Text(group_3, SWT.BORDER);
		text_17.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Group group_4 = new Group(composite_3, SWT.NONE);
		group_4.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		group_4.setText("\u79FB\u5361\u6570\u636E\u5E93\u914D\u7F6E");
		group_4.setLayout(new GridLayout(4, false));
		
		Label lblNewLabel_17 = new Label(group_4, SWT.NONE);
		lblNewLabel_17.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_17.setText("\u6570\u636E\u5E93IP");
		
		text_18 = new Text(group_4, SWT.BORDER);
		GridData gd_text_18 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_text_18.widthHint = 150;
		text_18.setLayoutData(gd_text_18);
		
		Label lblNewLabel_18 = new Label(group_4, SWT.NONE);
		lblNewLabel_18.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_18.setText("\u7528\u6237\u540D");
		
		text_19 = new Text(group_4, SWT.BORDER);
		text_19.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_19 = new Label(group_4, SWT.NONE);
		lblNewLabel_19.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_19.setText("\u6570\u636E\u5E93\u540D\u79F0");
		
		text_20 = new Text(group_4, SWT.BORDER);
		text_20.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_20 = new Label(group_4, SWT.NONE);
		lblNewLabel_20.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_20.setText("\u5BC6\u7801");
		
		text_21 = new Text(group_4, SWT.BORDER);
		text_21.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

	}
}
