package com.bots.take.testbotsandroid.models;

import com.orm.SugarRecord;

import net.take.blipchat.AuthType;

public class ChatConfiguration extends SugarRecord<ChatConfiguration> {
    public String BotAlias;
    public String UserIdentifier;
    public String UserPassWord;
    public String UserName;
    public String UserEmail;
    public String BotIdentifier;
    public AuthType AuthType;
    public int ChatConfigurationId;

    public ChatConfiguration() {
    }

    public ChatConfiguration(String UserIdentifier, String UserPassWord, String UserName, String UserEmail, String BotIdentifier, String BotAlias, AuthType AuthType) {
        this.BotAlias = BotAlias;
        this.UserIdentifier = UserIdentifier;
        this.UserPassWord = UserPassWord;
        this.UserName = UserName;
        this.UserEmail = UserEmail;
        this.BotIdentifier = BotIdentifier;
        this.AuthType = AuthType;
    }

}