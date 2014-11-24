# DialEasy - らくらくフォンアプリ

特定の場所にだけ簡単に電話できるアプリ。
Lollipopでアプリ固定して使うとらくらくフォンになる予定。


### 参考資料

* [npaka先生](http://www.saturn.dti.ne.jp/npaka/android/ActivityEx/index.html)
* [Javascriptから電話機能をつかう](http://blog.livedoor.jp/hiroki0907/archives/51728780.html)
* [WebViewでJavaScriptからJavaメソッドを使用する](http://techbooster.jpn.org/andriod/application/3189/)

### カスタマイズ

以下のようなファイル```data.js```をassetの下に置いておく。police.pngのようなファイルも用意する。

```
var data = [
    ["police", "110"],
    ["ambulance", "119"]
];```