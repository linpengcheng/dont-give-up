(defproject org.clojars.czan/dont-give-up "0.1.0-SNAPSHOT"
  :description "Common Lisp style restarts in Clojure"
  :url "https://github.com/czan/dont-give-up"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.nrepl "0.2.12"]]
  :repl-options {:nrepl-middleware [dont-give-up.middleware/handle-restarts]})
