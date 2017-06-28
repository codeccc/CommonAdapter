package com.beyondin.baseadapterandbinding;

/**
 * Created by wangbo on 2017-06-28.
 */

public class CommentModel
{
    public static int TYPE_STUDENT = 1;
    public static int TYPE_TEACHER = 2;
    public static int TYPE_PARENT = 3;

    public String headurl = "";
    public String name;
    public String content;
    public int type;

    public CommentModel()
    {
    }

    public CommentModel(String headurl, String name, String content, int type)
    {
        this.headurl = headurl;
        this.name = name;
        this.content = content;
        this.type = type;
    }
}
