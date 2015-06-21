package warmup1;

public class StartOz {

//    Given a string, return a string made of the first 2 chars (if present),
//    however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
//
//    startOz("ozymandias") → "oz"
//    startOz("bzoo") → "z"
//    startOz("oxx") → "o"

    public String startOz(String str) {
//        if (str.length() > 0) {
//            String firstChar = str.substring(0, 1);
//            String secondChar = str.substring(1, str.length() == 1 ? 1 : 2);
//
//            if ("o".equals(firstChar) && "z".equals(secondChar)) {
//                return "oz";
//            } else if ("o".equals(firstChar) && !"z".equals(secondChar)) {
//                return "o";
//            } else if (!"o".equals(firstChar) && "z".equals(secondChar)) {
//                return "z";
//            }
//        }
//        return "";

        //Using charAt with builder
        StringBuilder stringBuilder = new StringBuilder("");

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            stringBuilder.append("o");
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            stringBuilder.append("z");
        }

        return stringBuilder.toString();
    }
}
