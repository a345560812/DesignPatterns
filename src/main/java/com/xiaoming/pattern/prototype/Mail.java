package com.xiaoming.pattern.prototype;

import java.text.MessageFormat;

public class Mail implements Cloneable {
    private String name;

    private String emailAddress;

    private String content;

    public Mail () {
        System.out.println("Mail Class Constructor!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class MailUtil {
    public static void sendMail (Mail mail) {
        String outputContent = "向{0}同学, 邮件地址：{1},邮件内容：{2}, 发送邮件成功！";
        System.out.println(MessageFormat.format(
                outputContent,
                mail.getName(),
                mail.getEmailAddress(), mail.getContent())
        );
    }
}
