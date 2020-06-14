class Execute { //Comment
  public static void main(String[] args) {
    // static クラス
    Outer.StaticInner staticInner = new Outer.StaticInner();
    staticInner.setIn(10);
    System.out.println(staticInner.getIn());

    // 厳密的なメンバクラス
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();
    inner.setStr("ABC");
    System.out.println(inner.getStr());

  }
}