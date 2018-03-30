public class AppUtils {

  /**
   * generation string with application hash key
   */
  public static String getApplicationHashKey
  String hashKeyStr = null;
    try{
    PackageInfo info = getPackageManager().getPackageInfo(
        getApplicationContext().getPackageName(),
        PackageManager.GET_SIGNATURES);
    for (Signature signature : info.signatures) {
      MessageDigest md = MessageDigest.getInstance("SHA");
      md.update(signature.toByteArray());
      hashKeyStr = Base64.encodeToString(md.digest(), Base64.DEFAULT);
    }
  } catch(
  NameNotFoundException e)

  {

  } catch(
  NoSuchAlgorithmException e)

  {

  }
return hashKeyStr;
}