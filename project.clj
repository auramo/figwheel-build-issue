(defproject figwheel-issue "1.2.3"
  :plugins [[lein-cljsbuild "1.0.6"]
            [lein-figwheel "0.3.3"]]
  :dependencies [[org.clojure/clojurescript "0.0-3269"]
                 [org.clojure/clojure "1.7.0-beta3"]]
  :cljsbuild {
              :builds [{ :id "dev"
                        :source-paths ["src"]
                        :figwheel true
                        :compiler {
                                   :main myproject/core
                                   :hashbang false
                                   :asset-path "js/out"
                                   :output-to "resources/public/js/example.js"
                                   :output-dir "resources/public/js/out"
                                   :optimizations :none}}]})


