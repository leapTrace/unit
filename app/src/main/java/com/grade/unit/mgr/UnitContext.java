package com.grade.unit.mgr;

import android.content.Context;

/**
 * UnitContext : 全局Context管理器 Application
 * <p>
 * </> Created by ylwei on 2018/2/24.
 */
public class UnitContext {
  private static Object instance;

  public static Context getInstance() {
    if (null == instance)
      throw new NullPointerException("you should init UnitContext first");
    return (Context) instance;
  }

  public static void init(Context context) {
    if (null == context)
      throw new NullPointerException("context is NULL");
    instance = context.getApplicationContext();
  }

}
