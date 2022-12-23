package dev.rabbit.generated;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.generated.Int24;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.abi.datatypes.generated.Uint128;
import org.web3j.abi.datatypes.generated.Uint16;
import org.web3j.abi.datatypes.generated.Uint160;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.9.4.
 */
@SuppressWarnings("rawtypes")
public class IUniswapV3PoolEvents extends Contract {
    public static final String BINARY = "";

    public static final Event BURN_EVENT = new Event("Burn", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Int24>(true) {}, new TypeReference<Int24>(true) {}, new TypeReference<Uint128>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event COLLECT_EVENT = new Event("Collect", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>() {}, new TypeReference<Int24>(true) {}, new TypeReference<Int24>(true) {}, new TypeReference<Uint128>() {}, new TypeReference<Uint128>() {}));
    ;

    public static final Event COLLECTPROTOCOL_EVENT = new Event("CollectProtocol", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Uint128>() {}, new TypeReference<Uint128>() {}));
    ;

    public static final Event FLASH_EVENT = new Event("Flash", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event INCREASEOBSERVATIONCARDINALITYNEXT_EVENT = new Event("IncreaseObservationCardinalityNext", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint16>() {}, new TypeReference<Uint16>() {}));
    ;

    public static final Event INITIALIZE_EVENT = new Event("Initialize", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint160>() {}, new TypeReference<Int24>() {}));
    ;

    public static final Event MINT_EVENT = new Event("Mint", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>(true) {}, new TypeReference<Int24>(true) {}, new TypeReference<Int24>(true) {}, new TypeReference<Uint128>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event SETFEEPROTOCOL_EVENT = new Event("SetFeeProtocol", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}, new TypeReference<Uint8>() {}, new TypeReference<Uint8>() {}, new TypeReference<Uint8>() {}));
    ;

    public static final Event SWAP_EVENT = new Event("Swap", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Int256>() {}, new TypeReference<Int256>() {}, new TypeReference<Uint160>() {}, new TypeReference<Uint128>() {}, new TypeReference<Int24>() {}));
    ;

    @Deprecated
    protected IUniswapV3PoolEvents(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected IUniswapV3PoolEvents(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected IUniswapV3PoolEvents(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected IUniswapV3PoolEvents(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static List<BurnEventResponse> getBurnEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(BURN_EVENT, transactionReceipt);
        ArrayList<BurnEventResponse> responses = new ArrayList<BurnEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            BurnEventResponse typedResponse = new BurnEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.tickLower = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.tickUpper = (BigInteger) eventValues.getIndexedValues().get(2).getValue();
            typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.amount0 = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.amount1 = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<BurnEventResponse> burnEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, BurnEventResponse>() {
            @Override
            public BurnEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(BURN_EVENT, log);
                BurnEventResponse typedResponse = new BurnEventResponse();
                typedResponse.log = log;
                typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.tickLower = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.tickUpper = (BigInteger) eventValues.getIndexedValues().get(2).getValue();
                typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.amount0 = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.amount1 = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<BurnEventResponse> burnEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(BURN_EVENT));
        return burnEventFlowable(filter);
    }

    public static List<CollectEventResponse> getCollectEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(COLLECT_EVENT, transactionReceipt);
        ArrayList<CollectEventResponse> responses = new ArrayList<CollectEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            CollectEventResponse typedResponse = new CollectEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.tickLower = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.tickUpper = (BigInteger) eventValues.getIndexedValues().get(2).getValue();
            typedResponse.recipient = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.amount0 = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.amount1 = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<CollectEventResponse> collectEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, CollectEventResponse>() {
            @Override
            public CollectEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(COLLECT_EVENT, log);
                CollectEventResponse typedResponse = new CollectEventResponse();
                typedResponse.log = log;
                typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.tickLower = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.tickUpper = (BigInteger) eventValues.getIndexedValues().get(2).getValue();
                typedResponse.recipient = (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.amount0 = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.amount1 = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<CollectEventResponse> collectEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(COLLECT_EVENT));
        return collectEventFlowable(filter);
    }

    public static List<CollectProtocolEventResponse> getCollectProtocolEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(COLLECTPROTOCOL_EVENT, transactionReceipt);
        ArrayList<CollectProtocolEventResponse> responses = new ArrayList<CollectProtocolEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            CollectProtocolEventResponse typedResponse = new CollectProtocolEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.sender = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.recipient = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.amount0 = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.amount1 = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<CollectProtocolEventResponse> collectProtocolEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, CollectProtocolEventResponse>() {
            @Override
            public CollectProtocolEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(COLLECTPROTOCOL_EVENT, log);
                CollectProtocolEventResponse typedResponse = new CollectProtocolEventResponse();
                typedResponse.log = log;
                typedResponse.sender = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.recipient = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.amount0 = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.amount1 = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<CollectProtocolEventResponse> collectProtocolEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(COLLECTPROTOCOL_EVENT));
        return collectProtocolEventFlowable(filter);
    }

    public static List<FlashEventResponse> getFlashEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(FLASH_EVENT, transactionReceipt);
        ArrayList<FlashEventResponse> responses = new ArrayList<FlashEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            FlashEventResponse typedResponse = new FlashEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.sender = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.recipient = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.amount0 = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.amount1 = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.paid0 = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse.paid1 = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<FlashEventResponse> flashEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, FlashEventResponse>() {
            @Override
            public FlashEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(FLASH_EVENT, log);
                FlashEventResponse typedResponse = new FlashEventResponse();
                typedResponse.log = log;
                typedResponse.sender = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.recipient = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.amount0 = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.amount1 = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.paid0 = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse.paid1 = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<FlashEventResponse> flashEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(FLASH_EVENT));
        return flashEventFlowable(filter);
    }

    public static List<IncreaseObservationCardinalityNextEventResponse> getIncreaseObservationCardinalityNextEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(INCREASEOBSERVATIONCARDINALITYNEXT_EVENT, transactionReceipt);
        ArrayList<IncreaseObservationCardinalityNextEventResponse> responses = new ArrayList<IncreaseObservationCardinalityNextEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            IncreaseObservationCardinalityNextEventResponse typedResponse = new IncreaseObservationCardinalityNextEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.observationCardinalityNextOld = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.observationCardinalityNextNew = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<IncreaseObservationCardinalityNextEventResponse> increaseObservationCardinalityNextEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, IncreaseObservationCardinalityNextEventResponse>() {
            @Override
            public IncreaseObservationCardinalityNextEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(INCREASEOBSERVATIONCARDINALITYNEXT_EVENT, log);
                IncreaseObservationCardinalityNextEventResponse typedResponse = new IncreaseObservationCardinalityNextEventResponse();
                typedResponse.log = log;
                typedResponse.observationCardinalityNextOld = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.observationCardinalityNextNew = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<IncreaseObservationCardinalityNextEventResponse> increaseObservationCardinalityNextEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(INCREASEOBSERVATIONCARDINALITYNEXT_EVENT));
        return increaseObservationCardinalityNextEventFlowable(filter);
    }

    public static List<InitializeEventResponse> getInitializeEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(INITIALIZE_EVENT, transactionReceipt);
        ArrayList<InitializeEventResponse> responses = new ArrayList<InitializeEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            InitializeEventResponse typedResponse = new InitializeEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.sqrtPriceX96 = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.tick = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<InitializeEventResponse> initializeEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, InitializeEventResponse>() {
            @Override
            public InitializeEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(INITIALIZE_EVENT, log);
                InitializeEventResponse typedResponse = new InitializeEventResponse();
                typedResponse.log = log;
                typedResponse.sqrtPriceX96 = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.tick = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<InitializeEventResponse> initializeEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(INITIALIZE_EVENT));
        return initializeEventFlowable(filter);
    }

    public static List<MintEventResponse> getMintEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(MINT_EVENT, transactionReceipt);
        ArrayList<MintEventResponse> responses = new ArrayList<MintEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            MintEventResponse typedResponse = new MintEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.tickLower = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.tickUpper = (BigInteger) eventValues.getIndexedValues().get(2).getValue();
            typedResponse.sender = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.amount0 = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse.amount1 = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<MintEventResponse> mintEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, MintEventResponse>() {
            @Override
            public MintEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(MINT_EVENT, log);
                MintEventResponse typedResponse = new MintEventResponse();
                typedResponse.log = log;
                typedResponse.owner = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.tickLower = (BigInteger) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.tickUpper = (BigInteger) eventValues.getIndexedValues().get(2).getValue();
                typedResponse.sender = (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.amount0 = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse.amount1 = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<MintEventResponse> mintEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(MINT_EVENT));
        return mintEventFlowable(filter);
    }

    public static List<SetFeeProtocolEventResponse> getSetFeeProtocolEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(SETFEEPROTOCOL_EVENT, transactionReceipt);
        ArrayList<SetFeeProtocolEventResponse> responses = new ArrayList<SetFeeProtocolEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            SetFeeProtocolEventResponse typedResponse = new SetFeeProtocolEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.feeProtocol0Old = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.feeProtocol1Old = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.feeProtocol0New = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse.feeProtocol1New = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<SetFeeProtocolEventResponse> setFeeProtocolEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, SetFeeProtocolEventResponse>() {
            @Override
            public SetFeeProtocolEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(SETFEEPROTOCOL_EVENT, log);
                SetFeeProtocolEventResponse typedResponse = new SetFeeProtocolEventResponse();
                typedResponse.log = log;
                typedResponse.feeProtocol0Old = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.feeProtocol1Old = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.feeProtocol0New = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse.feeProtocol1New = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<SetFeeProtocolEventResponse> setFeeProtocolEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(SETFEEPROTOCOL_EVENT));
        return setFeeProtocolEventFlowable(filter);
    }

    public static List<SwapEventResponse> getSwapEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(SWAP_EVENT, transactionReceipt);
        ArrayList<SwapEventResponse> responses = new ArrayList<SwapEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            SwapEventResponse typedResponse = new SwapEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.sender = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.recipient = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.amount0 = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.amount1 = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.sqrtPriceX96 = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse.liquidity = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
            typedResponse.tick = (BigInteger) eventValues.getNonIndexedValues().get(4).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<SwapEventResponse> swapEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, SwapEventResponse>() {
            @Override
            public SwapEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(SWAP_EVENT, log);
                SwapEventResponse typedResponse = new SwapEventResponse();
                typedResponse.log = log;
                typedResponse.sender = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.recipient = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.amount0 = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.amount1 = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.sqrtPriceX96 = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse.liquidity = (BigInteger) eventValues.getNonIndexedValues().get(3).getValue();
                typedResponse.tick = (BigInteger) eventValues.getNonIndexedValues().get(4).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<SwapEventResponse> swapEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(SWAP_EVENT));
        return swapEventFlowable(filter);
    }

    @Deprecated
    public static IUniswapV3PoolEvents load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new IUniswapV3PoolEvents(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static IUniswapV3PoolEvents load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new IUniswapV3PoolEvents(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static IUniswapV3PoolEvents load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new IUniswapV3PoolEvents(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static IUniswapV3PoolEvents load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new IUniswapV3PoolEvents(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<IUniswapV3PoolEvents> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(IUniswapV3PoolEvents.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<IUniswapV3PoolEvents> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(IUniswapV3PoolEvents.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<IUniswapV3PoolEvents> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(IUniswapV3PoolEvents.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<IUniswapV3PoolEvents> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(IUniswapV3PoolEvents.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static class BurnEventResponse extends BaseEventResponse {
        public String owner;

        public BigInteger tickLower;

        public BigInteger tickUpper;

        public BigInteger amount;

        public BigInteger amount0;

        public BigInteger amount1;
    }

    public static class CollectEventResponse extends BaseEventResponse {
        public String owner;

        public BigInteger tickLower;

        public BigInteger tickUpper;

        public String recipient;

        public BigInteger amount0;

        public BigInteger amount1;
    }

    public static class CollectProtocolEventResponse extends BaseEventResponse {
        public String sender;

        public String recipient;

        public BigInteger amount0;

        public BigInteger amount1;
    }

    public static class FlashEventResponse extends BaseEventResponse {
        public String sender;

        public String recipient;

        public BigInteger amount0;

        public BigInteger amount1;

        public BigInteger paid0;

        public BigInteger paid1;
    }

    public static class IncreaseObservationCardinalityNextEventResponse extends BaseEventResponse {
        public BigInteger observationCardinalityNextOld;

        public BigInteger observationCardinalityNextNew;
    }

    public static class InitializeEventResponse extends BaseEventResponse {
        public BigInteger sqrtPriceX96;

        public BigInteger tick;
    }

    public static class MintEventResponse extends BaseEventResponse {
        public String owner;

        public BigInteger tickLower;

        public BigInteger tickUpper;

        public String sender;

        public BigInteger amount;

        public BigInteger amount0;

        public BigInteger amount1;
    }

    public static class SetFeeProtocolEventResponse extends BaseEventResponse {
        public BigInteger feeProtocol0Old;

        public BigInteger feeProtocol1Old;

        public BigInteger feeProtocol0New;

        public BigInteger feeProtocol1New;
    }

    public static class SwapEventResponse extends BaseEventResponse {
        public String sender;

        public String recipient;

        public BigInteger amount0;

        public BigInteger amount1;

        public BigInteger sqrtPriceX96;

        public BigInteger liquidity;

        public BigInteger tick;
    }
}
