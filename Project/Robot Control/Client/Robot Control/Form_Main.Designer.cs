namespace Robot_Control
{
    partial class Form_Main
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            button_greeting = new Button();
            button_hi = new Button();
            button_win = new Button();
            button_loss = new Button();
            button_fight = new Button();
            button_connect = new Button();
            pictureBox1 = new PictureBox();
            richTextBox_console = new RichTextBox();
            ((System.ComponentModel.ISupportInitialize)pictureBox1).BeginInit();
            SuspendLayout();
            // 
            // button_greeting
            // 
            button_greeting.Location = new Point(12, 12);
            button_greeting.Name = "button_greeting";
            button_greeting.Size = new Size(223, 39);
            button_greeting.TabIndex = 0;
            button_greeting.Text = "Greeting";
            button_greeting.UseVisualStyleBackColor = true;
            // 
            // button_hi
            // 
            button_hi.Location = new Point(12, 57);
            button_hi.Name = "button_hi";
            button_hi.Size = new Size(223, 39);
            button_hi.TabIndex = 1;
            button_hi.Text = "Hi";
            button_hi.UseVisualStyleBackColor = true;
            // 
            // button_win
            // 
            button_win.Location = new Point(12, 102);
            button_win.Name = "button_win";
            button_win.Size = new Size(223, 39);
            button_win.TabIndex = 2;
            button_win.Text = "Win";
            button_win.UseVisualStyleBackColor = true;
            // 
            // button_loss
            // 
            button_loss.Location = new Point(12, 147);
            button_loss.Name = "button_loss";
            button_loss.Size = new Size(223, 39);
            button_loss.TabIndex = 3;
            button_loss.Text = "Loss";
            button_loss.UseVisualStyleBackColor = true;
            // 
            // button_fight
            // 
            button_fight.Location = new Point(12, 192);
            button_fight.Name = "button_fight";
            button_fight.Size = new Size(223, 39);
            button_fight.TabIndex = 4;
            button_fight.Text = "Fight";
            button_fight.UseVisualStyleBackColor = true;
            // 
            // button_connect
            // 
            button_connect.Location = new Point(241, 12);
            button_connect.Name = "button_connect";
            button_connect.Size = new Size(223, 39);
            button_connect.TabIndex = 5;
            button_connect.Text = "Connect";
            button_connect.UseVisualStyleBackColor = true;
            // 
            // pictureBox1
            // 
            pictureBox1.Image = Properties.Resources._9960074F5CC5F2FD09__1_;
            pictureBox1.Location = new Point(241, 57);
            pictureBox1.Name = "pictureBox1";
            pictureBox1.Size = new Size(223, 174);
            pictureBox1.SizeMode = PictureBoxSizeMode.CenterImage;
            pictureBox1.TabIndex = 6;
            pictureBox1.TabStop = false;
            // 
            // richTextBox_console
            // 
            richTextBox_console.BackColor = SystemColors.WindowText;
            richTextBox_console.Font = new Font("굴림", 9F, FontStyle.Regular, GraphicsUnit.Point);
            richTextBox_console.ForeColor = SystemColors.Window;
            richTextBox_console.Location = new Point(470, 12);
            richTextBox_console.Name = "richTextBox_console";
            richTextBox_console.Size = new Size(223, 219);
            richTextBox_console.TabIndex = 7;
            richTextBox_console.Text = "";
            // 
            // Form_Main
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(702, 244);
            Controls.Add(richTextBox_console);
            Controls.Add(pictureBox1);
            Controls.Add(button_connect);
            Controls.Add(button_fight);
            Controls.Add(button_loss);
            Controls.Add(button_win);
            Controls.Add(button_hi);
            Controls.Add(button_greeting);
            Name = "Form_Main";
            Text = "Robot Control";
            Load += Form_Main_Load;
            ((System.ComponentModel.ISupportInitialize)pictureBox1).EndInit();
            ResumeLayout(false);
        }

        #endregion

        private Button button_greeting;
        private Button button_hi;
        private Button button_win;
        private Button button_loss;
        private Button button_fight;
        private Button button_connect;
        private PictureBox pictureBox1;
        private RichTextBox richTextBox_console;
    }
}