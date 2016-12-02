(ns snowdata.prod
  (:require [snowdata.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
