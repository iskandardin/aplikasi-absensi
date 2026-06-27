# Retrofit
-keep class retrofit2.** { *; }
-keep interface retrofit2.** { *; }
-keepattributes Signature
-keepattributes Exceptions

# Gson
-keep class com.google.gson.** { *; }
-keepattributes EnclosingMethod
-keepattributes InnerClasses

# ZXing
-keep class com.google.zxing.** { *; }
-keep interface com.google.zxing.** { *; }

# Hilt
-keep class dagger.hilt.** { *; }
-keep interface dagger.hilt.** { *; }

# Room
-keep class androidx.room.** { *; }
-keep interface androidx.room.** { *; }

# Generic signature of Keep
-keepattributes Signature
-keepattributes RuntimeVisibleAnnotations
