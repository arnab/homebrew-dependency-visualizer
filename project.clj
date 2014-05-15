(defproject homebrew-dependency-visualizer "0.1.0-SNAPSHOT"
  :description "set of tools to homebrew dependency visualize"
  :url "http://example.com/FIXME"
  :license {:name "MIT License"
            :url "https://github.com/arnab/homebrew-dependency-visualizer/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.trace "0.7.8"]
                                  [print-foo "0.5.0"]
                                  [lein-kibit "0.0.8"]
                                  [jonase/eastwood "0.1.2"]]}} )
