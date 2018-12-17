public class TextUtils{
/**
   * filter to editText allow all digits and letters and some symbols 
   */
  private static InputFilter filter = (source, start, end, dest, dstart, dend) -> {

    for (int i = start;i < end;i++) {
      if (!Character.isLetterOrDigit(source.charAt(i)) &&
          !Character.toString(source.charAt(i)).equals("_") &&
          !Character.toString(source.charAt(i)).equals("@") &&
          !Character.toString(source.charAt(i)).equals(".") &&
          !Character.toString(source.charAt(i)).equals("+") &&
          !Character.toString(source.charAt(i)).equals("-")) {
        return "";
      }
    }
    return null;
  };
  private static   InputFilter[] filters = new InputFilter[] { filter };
  public static InputFilter[] getBlockCharactersFilter(){return filters;}
  }
