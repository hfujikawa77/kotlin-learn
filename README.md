## Kotlin学習用リポジトリ
[Kotlin公式サイトのサンプルコード](https://play.kotlinlang.org/byExample/overview) を参照して作成したKotlin学習用ソースコード

### 前提
* Javaがインストールされていること
* Windows11が導入されたPCを使用
* IDEとしてVS Codeを使用

### 導入・実行手順  
1. Kotlinコンパイラのインストール  
   1. [GitHubのリリースページ](https://github.com/JetBrains/kotlin/releases/tag/v1.8.0) から `kotlin-compiler-＜バージョン＞.zip` をダウンロードする
   2. zipファイルを展開し、`kotlinc\bin` フォルダを環境変数Pathに追加する

2. VSCode拡張機能のインストール
   * Kotlin
   * Kotlin Language
   * Code Runner
   * Kotlin Formatter
3. 実行
   1. VSCode  
      実行対象のソースコードを開いて、ソースコード左上の▷(Run Code)ボタンをクリック 
   2. コマンドライン  
      PowerShellを開いて下記コマンドを実行
      ```powershell
      kotlinc fizzbuzz.kt -include-runtime -d fizzbuzz.jar | java -jar fizzbuzz.jar
      ```