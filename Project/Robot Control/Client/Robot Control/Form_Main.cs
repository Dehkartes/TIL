using System.Text;

namespace Robot_Control
{
    public partial class Form_Main : Form
    {
        public Form_Main()
        {
            InitializeComponent();
            Console.SetOut(new TextBoxWriter(richTextBox_console));
        }

        public class TextBoxWriter : TextWriter
        {
            private RichTextBox textBox;

            public TextBoxWriter(RichTextBox textBox)
            {
                this.textBox = textBox;
            }

            public override void Write(char value)
            {
                textBox.Invoke((MethodInvoker)(() =>
                {
                    textBox.AppendText(value.ToString());
                }));
            }

            public override void Write(string? value)
            {
                textBox.Invoke((MethodInvoker)(() =>
                {
                    textBox.AppendText(value);
                }));
            }

            public override Encoding Encoding => Encoding.Default;
        }

        private void Form_Main_Load(object sender, EventArgs e)
        {
            Console.WriteLine("Initialized");
            Robot rapi = new Robot();
            rapi.test();
        }
    }
}