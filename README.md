# DialEasy - らくらくフォンアプリ

特定の場所にだけ簡単に電話できるアプリです.。
Lollipopでアプリ固定して使うとらくらくフォンになる予定。

###動作画面

* 顔をタッチすると電話がかかります
* テンキーをタッチするとテンキー画面になります
* 放置すると初期画面に戻ります

![](http://gyazo.com/b9227276dda73a5b9c0d2965e5962983.png)

### 参考資料

インタフェースはJavaScriptで記述し、電話するところはJavaで記述しているので、JavaScriptからJavaを呼ぶ必要がある。

* [npaka先生](http://www.saturn.dti.ne.jp/npaka/android/ActivityEx/index.html)
* [Javascriptから電話機能をつかう](http://blog.livedoor.jp/hiroki0907/archives/51728780.html)
* [WebViewでJavaScriptからJavaメソッドを使用する](http://techbooster.jpn.org/andriod/application/3189/)

### カスタマイズ

以下のようなファイル```data.js```をassetの下に置いておきます。police.pngのような画像ファイルも用意します。
(96px × 96px のPNG)

```
var data = [
    ["police", "110"],
    ["ambulance", "119"]
];
```

### 展望

特定の相手に定形文をメールするとか、
特定のWebページにアクセスするとかいった機能も入れてみたい。
