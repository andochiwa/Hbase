# 1. HBase简介

## 定义

HBase 是一种分布式，可扩展，支持海量数据存储的 NoSQL 数据库

## 数据模型

逻辑上，HBase 的数据模型和关系型数据库很类似，数据存储在一张表中有行有列。但从 HBase 的底层物理存储结构来看，HBase 更像一个 Multi-dimensional map

### 逻辑结构

<img src="./img/logic_structure.png" style="zoom:60%;" />